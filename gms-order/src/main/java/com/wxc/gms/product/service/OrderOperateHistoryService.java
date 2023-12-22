package com.wxc.gms.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxc.gms.common.utils.PageUtils;
import com.wxc.gms.product.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author wxc
 * @email wxc20221024@gmail.com
 * @date 2023-12-22 18:20:39
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

