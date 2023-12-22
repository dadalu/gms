package com.wxc.gms.product.dao;

import com.wxc.gms.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wxc
 * @email wxc20221024@gmail.com
 * @date 2023-12-22 18:21:31
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
