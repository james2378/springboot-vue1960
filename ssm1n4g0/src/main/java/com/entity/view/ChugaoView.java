package com.entity.view;

import com.entity.ChugaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 初稿
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 20:03:40
 */
@TableName("chugao")
public class ChugaoView  extends ChugaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChugaoView(){
	}
 
 	public ChugaoView(ChugaoEntity chugaoEntity){
 	try {
			BeanUtils.copyProperties(this, chugaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
