package com.dao;

import com.entity.ChugaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChugaoVO;
import com.entity.view.ChugaoView;


/**
 * 初稿
 * 
 * @author 
 * @email 
 * @date 2021-04-15 20:03:40
 */
public interface ChugaoDao extends BaseMapper<ChugaoEntity> {
	
	List<ChugaoVO> selectListVO(@Param("ew") Wrapper<ChugaoEntity> wrapper);
	
	ChugaoVO selectVO(@Param("ew") Wrapper<ChugaoEntity> wrapper);
	
	List<ChugaoView> selectListView(@Param("ew") Wrapper<ChugaoEntity> wrapper);

	List<ChugaoView> selectListView(Pagination page,@Param("ew") Wrapper<ChugaoEntity> wrapper);
	
	ChugaoView selectView(@Param("ew") Wrapper<ChugaoEntity> wrapper);
	
}
