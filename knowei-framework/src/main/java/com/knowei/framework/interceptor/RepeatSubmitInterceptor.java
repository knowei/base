package com.knowei.framework.interceptor;

import java.lang.reflect.Method;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import com.alibaba.fastjson2.JSON;
import com.knowei.common.annotation.RepeatSubmit;
import com.knowei.common.core.domain.AjaxResult;
import com.knowei.common.utils.ServletUtils;

/**
 * 防止重复提交拦截器
 */
@Component
@Slf4j
public abstract class RepeatSubmitInterceptor implements HandlerInterceptor {
    private final static ThreadLocal<StopWatch> CACHE = new ThreadLocal<>();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {
        StopWatch stopWatch = new StopWatch();
        CACHE.set(stopWatch);
        stopWatch.start();
        log.info("【请求开始】-> 地址{}, 请求方法{}", request.getRequestURI(), request.getMethod());

        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod)handler;
            Method method = handlerMethod.getMethod();
            RepeatSubmit annotation = method.getAnnotation(RepeatSubmit.class);
            if (annotation != null) {
                if (this.isRepeatSubmit(request, annotation)) {
                    AjaxResult ajaxResult = AjaxResult.error(annotation.message());
                    ServletUtils.renderString(response, JSON.toJSONString(ajaxResult));
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }

    /**
     * 验证是否重复提交由子类实现具体的防重复提交的规则
     *
     * @param request    请求信息
     * @param annotation 防重复注解参数
     * @return 结果
     * @throws Exception
     */
    public abstract boolean isRepeatSubmit(HttpServletRequest request, RepeatSubmit annotation);

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
        throws Exception {
        StopWatch stopWatch = CACHE.get();
        if (stopWatch != null) {
            log.info("【请求结束】耗时->{} ms", stopWatch.getTotalTimeMillis());
            CACHE.remove();
        }

        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
