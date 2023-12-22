package com.wxc.gms.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxc.gms.common.utils.PageUtils;
import com.wxc.gms.product.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author wxc
 * @email wxc20221024@gmail.com
 * @date 2023-12-22 18:20:39
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

