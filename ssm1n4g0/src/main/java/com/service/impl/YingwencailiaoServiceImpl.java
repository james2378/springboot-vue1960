package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YingwencailiaoDao;
import com.entity.YingwencailiaoEntity;
import com.service.YingwencailiaoService;
import com.entity.vo.YingwencailiaoVO;
import com.entity.view.YingwencailiaoView;

@Service("yingwencailiaoService")
public class YingwencailiaoServiceImpl extends ServiceImpl<YingwencailiaoDao, YingwencailiaoEntity> implements YingwencailiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingwencailiaoEntity> page = this.selectPage(
                new Query<YingwencailiaoEntity>(params).getPage(),
                new EntityWrapper<YingwencailiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingwencailiaoEntity> wrapper) {
		  Page<YingwencailiaoView> page =new Query<YingwencailiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingwencailiaoVO> selectListVO(Wrapper<YingwencailiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingwencailiaoVO selectVO(Wrapper<YingwencailiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingwencailiaoView> selectListView(Wrapper<YingwencailiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingwencailiaoView selectView(Wrapper<YingwencailiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
