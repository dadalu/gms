package com.wxc.gms.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxc.gms.common.utils.PageUtils;
import com.wxc.gms.product.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author wxc
 * @email wxc20221024@gmail.com
 * @date 2023-12-22 18:20:39
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

