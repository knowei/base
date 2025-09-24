package com.knowei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.knowei.entity.Author;
import com.knowei.mapper.AuthorMapper;
import com.knowei.service.IAuthorService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 作者表 服务实现类
 * </p>
 *
 * @author knowei
 * @since 2025-09-24
 */
@Service
public class AuthorServiceImpl extends ServiceImpl<AuthorMapper, Author> implements IAuthorService {

}
