package com.wxc.gms.coupon.service.impl;

import com.wxc.gms.coupon.dao.SmsCouponSpuCategoryRelationDao;
import com.wxc.gms.coupon.entity.SmsCouponSpuCategoryRelationEntity;
import com.wxc.gms.coupon.service.SmsCouponSpuCategoryRelationService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxc.gms.common.utils.PageUtils;
import com.wxc.gms.common.utils.Query;


@Service("smsCouponSpuCategoryRelationService")
public class SmsCouponSpuCategoryRelationServiceImpl extends ServiceImpl<SmsCouponSpuCategoryRelationDao, SmsCouponSpuCategoryRelationEntity> implements SmsCouponSpuCategoryRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsCouponSpuCategoryRelationEntity> page = this.page(
                new Query<SmsCouponSpuCategoryRelationEntity>().getPage(params),
                new QueryWrapper<SmsCouponSpuCategoryRelationEntity>()
        );

        return new PageUtils(page);
    }

}