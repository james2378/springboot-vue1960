package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuizhonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuizhonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuizhonggaoView;


/**
 * 最终稿
 *
 * @author 
 * @email 
 * @date 2021-04-15 20:03:40
 */
public interface ZuizhonggaoService extends IService<ZuizhonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuizhonggaoVO> selectListVO(Wrapper<ZuizhonggaoEntity> wrapper);
   	
   	ZuizhonggaoVO selectVO(@Param("ew") Wrapper<ZuizhonggaoEntity> wrapper);
   	
   	List<ZuizhonggaoView> selectListView(Wrapper<ZuizhonggaoEntity> wrapper);
   	
   	ZuizhonggaoView selectView(@Param("ew") Wrapper<ZuizhonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuizhonggaoEntity> wrapper);
   	
}

