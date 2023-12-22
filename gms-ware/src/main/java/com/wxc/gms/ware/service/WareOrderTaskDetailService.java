package com.wxc.gms.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxc.gms.common.utils.PageUtils;
import com.wxc.gms.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author wxc
 * @email wxc20221024@gmail.com
 * @date 2023-12-22 18:24:27
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

