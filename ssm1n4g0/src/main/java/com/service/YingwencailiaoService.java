package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingwencailiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingwencailiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingwencailiaoView;


/**
 * 英文材料
 *
 * @author 
 * @email 
 * @date 2021-04-15 20:03:40
 */
public interface YingwencailiaoService extends IService<YingwencailiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingwencailiaoVO> selectListVO(Wrapper<YingwencailiaoEntity> wrapper);
   	
   	YingwencailiaoVO selectVO(@Param("ew") Wrapper<YingwencailiaoEntity> wrapper);
   	
   	List<YingwencailiaoView> selectListView(Wrapper<YingwencailiaoEntity> wrapper);
   	
   	YingwencailiaoView selectView(@Param("ew") Wrapper<YingwencailiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingwencailiaoEntity> wrapper);
   	
}

