package com.wxc.gms.member.dao;

import com.wxc.gms.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wxc
 * @email wxc20221024@gmail.com
 * @date 2023-12-21 14:47:17
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
