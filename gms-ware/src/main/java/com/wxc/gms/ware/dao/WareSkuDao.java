package com.wxc.gms.ware.dao;

import com.wxc.gms.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author wxc
 * @email wxc20221024@gmail.com
 * @date 2023-12-22 18:24:27
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
