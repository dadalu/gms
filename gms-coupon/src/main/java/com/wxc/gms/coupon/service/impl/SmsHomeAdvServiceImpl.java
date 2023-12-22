package com.wxc.gms.coupon.service.impl;

import com.wxc.gms.coupon.dao.SmsHomeAdvDao;
import com.wxc.gms.coupon.entity.SmsHomeAdvEntity;
import com.wxc.gms.coupon.service.SmsHomeAdvService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxc.gms.common.utils.PageUtils;
import com.wxc.gms.common.utils.Query;


@Service("smsHomeAdvService")
public class SmsHomeAdvServiceImpl extends ServiceImpl<SmsHomeAdvDao, SmsHomeAdvEntity> implements SmsHomeAdvService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsHomeAdvEntity> page = this.page(
                new Query<SmsHomeAdvEntity>().getPage(params),
                new QueryWrapper<SmsHomeAdvEntity>()
        );

        return new PageUtils(page);
    }

}