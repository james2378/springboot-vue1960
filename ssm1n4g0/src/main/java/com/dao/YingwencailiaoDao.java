package com.dao;

import com.entity.YingwencailiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingwencailiaoVO;
import com.entity.view.YingwencailiaoView;


/**
 * 英文材料
 * 
 * @author 
 * @email 
 * @date 2021-04-15 20:03:40
 */
public interface YingwencailiaoDao extends BaseMapper<YingwencailiaoEntity> {
	
	List<YingwencailiaoVO> selectListVO(@Param("ew") Wrapper<YingwencailiaoEntity> wrapper);
	
	YingwencailiaoVO selectVO(@Param("ew") Wrapper<YingwencailiaoEntity> wrapper);
	
	List<YingwencailiaoView> selectListView(@Param("ew") Wrapper<YingwencailiaoEntity> wrapper);

	List<YingwencailiaoView> selectListView(Pagination page,@Param("ew") Wrapper<YingwencailiaoEntity> wrapper);
	
	YingwencailiaoView selectView(@Param("ew") Wrapper<YingwencailiaoEntity> wrapper);
	
}
