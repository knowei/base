package com.knowei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.knowei.entity.UserBookshelf;
import com.knowei.mapper.UserBookshelfMapper;
import com.knowei.service.IUserBookshelfService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户书架表 服务实现类
 * </p>
 *
 * @author knowei
 * @since 2025-09-24
 */
@Service
public class UserBookshelfServiceImpl extends ServiceImpl<UserBookshelfMapper, UserBookshelf>
    implements IUserBookshelfService {

}
