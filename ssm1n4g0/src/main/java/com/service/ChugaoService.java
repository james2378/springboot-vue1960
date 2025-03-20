package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChugaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChugaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChugaoView;


/**
 * 初稿
 *
 * @author 
 * @email 
 * @date 2021-04-15 20:03:40
 */
public interface ChugaoService extends IService<ChugaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChugaoVO> selectListVO(Wrapper<ChugaoEntity> wrapper);
   	
   	ChugaoVO selectVO(@Param("ew") Wrapper<ChugaoEntity> wrapper);
   	
   	List<ChugaoView> selectListView(Wrapper<ChugaoEntity> wrapper);
   	
   	ChugaoView selectView(@Param("ew") Wrapper<ChugaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChugaoEntity> wrapper);
   	
}

