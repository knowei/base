package com.knowei.controller;

import com.knowei.service.INovalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 小说主表 前端控制器
 * </p>
 *
 * @author knowei
 * @since 2025-09-24
 */
@RestController
@RequestMapping("/noval")
public class NovalController {
    @Resource
    private INovalService novalService;

}
