package com.entity.view;

import com.entity.YingwencailiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 英文材料
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 20:03:40
 */
@TableName("yingwencailiao")
public class YingwencailiaoView  extends YingwencailiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YingwencailiaoView(){
	}
 
 	public YingwencailiaoView(YingwencailiaoEntity yingwencailiaoEntity){
 	try {
			BeanUtils.copyProperties(this, yingwencailiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
