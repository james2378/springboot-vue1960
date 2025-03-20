package com.dao;

import com.entity.ZuizhonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuizhonggaoVO;
import com.entity.view.ZuizhonggaoView;


/**
 * 最终稿
 * 
 * @author 
 * @email 
 * @date 2021-04-15 20:03:40
 */
public interface ZuizhonggaoDao extends BaseMapper<ZuizhonggaoEntity> {
	
	List<ZuizhonggaoVO> selectListVO(@Param("ew") Wrapper<ZuizhonggaoEntity> wrapper);
	
	ZuizhonggaoVO selectVO(@Param("ew") Wrapper<ZuizhonggaoEntity> wrapper);
	
	List<ZuizhonggaoView> selectListView(@Param("ew") Wrapper<ZuizhonggaoEntity> wrapper);

	List<ZuizhonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZuizhonggaoEntity> wrapper);
	
	ZuizhonggaoView selectView(@Param("ew") Wrapper<ZuizhonggaoEntity> wrapper);
	
}
