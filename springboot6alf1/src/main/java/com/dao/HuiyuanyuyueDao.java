package com.dao;

import com.entity.HuiyuanyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanyuyueVO;
import com.entity.view.HuiyuanyuyueView;


/**
 * 会员预约
 * 
 * @author 
 * @email 
 * @date 2021-04-30 10:31:54
 */
public interface HuiyuanyuyueDao extends BaseMapper<HuiyuanyuyueEntity> {
	
	List<HuiyuanyuyueVO> selectListVO(@Param("ew") Wrapper<HuiyuanyuyueEntity> wrapper);
	
	HuiyuanyuyueVO selectVO(@Param("ew") Wrapper<HuiyuanyuyueEntity> wrapper);
	
	List<HuiyuanyuyueView> selectListView(@Param("ew") Wrapper<HuiyuanyuyueEntity> wrapper);

	List<HuiyuanyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanyuyueEntity> wrapper);
	
	HuiyuanyuyueView selectView(@Param("ew") Wrapper<HuiyuanyuyueEntity> wrapper);
	
}
