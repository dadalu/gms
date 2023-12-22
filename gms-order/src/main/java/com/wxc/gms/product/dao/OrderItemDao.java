package com.wxc.gms.product.dao;

import com.wxc.gms.product.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author wxc
 * @email wxc20221024@gmail.com
 * @date 2023-12-22 18:20:39
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
