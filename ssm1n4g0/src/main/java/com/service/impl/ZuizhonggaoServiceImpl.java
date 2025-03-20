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


import com.dao.ZuizhonggaoDao;
import com.entity.ZuizhonggaoEntity;
import com.service.ZuizhonggaoService;
import com.entity.vo.ZuizhonggaoVO;
import com.entity.view.ZuizhonggaoView;

@Service("zuizhonggaoService")
public class ZuizhonggaoServiceImpl extends ServiceImpl<ZuizhonggaoDao, ZuizhonggaoEntity> implements ZuizhonggaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuizhonggaoEntity> page = this.selectPage(
                new Query<ZuizhonggaoEntity>(params).getPage(),
                new EntityWrapper<ZuizhonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuizhonggaoEntity> wrapper) {
		  Page<ZuizhonggaoView> page =new Query<ZuizhonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuizhonggaoVO> selectListVO(Wrapper<ZuizhonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuizhonggaoVO selectVO(Wrapper<ZuizhonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuizhonggaoView> selectListView(Wrapper<ZuizhonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuizhonggaoView selectView(Wrapper<ZuizhonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
