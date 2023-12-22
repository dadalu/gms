package com.wxc.gms.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxc.gms.common.utils.PageUtils;
import com.wxc.gms.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author wxc
 * @email wxc20221024@gmail.com
 * @date 2023-12-22 18:21:31
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

