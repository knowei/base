package com.knowei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.knowei.entity.Category;
import com.knowei.mapper.CategoryMapper;
import com.knowei.service.ICategoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 小说分类表 服务实现类
 * </p>
 *
 * @author knowei
 * @since 2025-09-24
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
