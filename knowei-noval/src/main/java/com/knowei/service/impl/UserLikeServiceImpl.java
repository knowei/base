package com.knowei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.knowei.entity.UserLike;
import com.knowei.mapper.UserLikeMapper;
import com.knowei.service.IUserLikeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户(收藏喜欢)表 服务实现类
 * </p>
 *
 * @author knowei
 * @since 2025-09-24
 */
@Service
public class UserLikeServiceImpl extends ServiceImpl<UserLikeMapper, UserLike> implements IUserLikeService {

}
