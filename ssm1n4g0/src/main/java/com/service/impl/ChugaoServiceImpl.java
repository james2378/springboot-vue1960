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


import com.dao.ChugaoDao;
import com.entity.ChugaoEntity;
import com.service.ChugaoService;
import com.entity.vo.ChugaoVO;
import com.entity.view.ChugaoView;

@Service("chugaoService")
public class ChugaoServiceImpl extends ServiceImpl<ChugaoDao, ChugaoEntity> implements ChugaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChugaoEntity> page = this.selectPage(
                new Query<ChugaoEntity>(params).getPage(),
                new EntityWrapper<ChugaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChugaoEntity> wrapper) {
		  Page<ChugaoView> page =new Query<ChugaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChugaoVO> selectListVO(Wrapper<ChugaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChugaoVO selectVO(Wrapper<ChugaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChugaoView> selectListView(Wrapper<ChugaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChugaoView selectView(Wrapper<ChugaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
