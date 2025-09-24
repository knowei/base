package com.knowei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.knowei.entity.UserReadHistory;
import com.knowei.mapper.UserReadHistoryMapper;
import com.knowei.service.IUserReadHistoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户阅读历史表 服务实现类
 * </p>
 *
 * @author knowei
 * @since 2025-09-24
 */
@Service
public class UserReadHistoryServiceImpl extends ServiceImpl<UserReadHistoryMapper, UserReadHistory>
    implements IUserReadHistoryService {

}
