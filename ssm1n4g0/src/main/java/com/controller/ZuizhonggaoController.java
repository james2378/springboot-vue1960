package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZuizhonggaoEntity;
import com.entity.view.ZuizhonggaoView;

import com.service.ZuizhonggaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 最终稿
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-15 20:03:40
 */
@RestController
@RequestMapping("/zuizhonggao")
public class ZuizhonggaoController {
    @Autowired
    private ZuizhonggaoService zuizhonggaoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZuizhonggaoEntity zuizhonggao, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			zuizhonggao.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZuizhonggaoEntity> ew = new EntityWrapper<ZuizhonggaoEntity>();
		PageUtils page = zuizhonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuizhonggao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZuizhonggaoEntity zuizhonggao, HttpServletRequest request){
        EntityWrapper<ZuizhonggaoEntity> ew = new EntityWrapper<ZuizhonggaoEntity>();
		PageUtils page = zuizhonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuizhonggao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZuizhonggaoEntity zuizhonggao){
       	EntityWrapper<ZuizhonggaoEntity> ew = new EntityWrapper<ZuizhonggaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zuizhonggao, "zuizhonggao")); 
        return R.ok().put("data", zuizhonggaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZuizhonggaoEntity zuizhonggao){
        EntityWrapper< ZuizhonggaoEntity> ew = new EntityWrapper< ZuizhonggaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zuizhonggao, "zuizhonggao")); 
		ZuizhonggaoView zuizhonggaoView =  zuizhonggaoService.selectView(ew);
		return R.ok("查询最终稿成功").put("data", zuizhonggaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZuizhonggaoEntity zuizhonggao = zuizhonggaoService.selectById(id);
        return R.ok().put("data", zuizhonggao);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZuizhonggaoEntity zuizhonggao = zuizhonggaoService.selectById(id);
        return R.ok().put("data", zuizhonggao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZuizhonggaoEntity zuizhonggao, HttpServletRequest request){
    	zuizhonggao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuizhonggao);

        zuizhonggaoService.insert(zuizhonggao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZuizhonggaoEntity zuizhonggao, HttpServletRequest request){
    	zuizhonggao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuizhonggao);

        zuizhonggaoService.insert(zuizhonggao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZuizhonggaoEntity zuizhonggao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zuizhonggao);
        zuizhonggaoService.updateById(zuizhonggao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zuizhonggaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZuizhonggaoEntity> wrapper = new EntityWrapper<ZuizhonggaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = zuizhonggaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
