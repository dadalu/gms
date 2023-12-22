package com.wxc.gms.product.dao;

import com.wxc.gms.product.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wxc
 * @email wxc20221024@gmail.com
 * @date 2023-12-22 18:20:39
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
