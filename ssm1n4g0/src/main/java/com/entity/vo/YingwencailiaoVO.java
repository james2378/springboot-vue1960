package com.entity.vo;

import com.entity.YingwencailiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 英文材料
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-15 20:03:40
 */
public class YingwencailiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 编号
	 */
	
	private String bianhao;
		
	/**
	 * 英文标题
	 */
	
	private String yingwenbiaoti;
		
	/**
	 * 英文内容
	 */
	
	private String yingwenneirong;
		
	/**
	 * 正文
	 */
	
	private String zhengwen;
		
	/**
	 * 电子档
	 */
	
	private String dianzidang;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：编号
	 */
	 
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	
	/**
	 * 获取：编号
	 */
	public String getBianhao() {
		return bianhao;
	}
				
	
	/**
	 * 设置：英文标题
	 */
	 
	public void setYingwenbiaoti(String yingwenbiaoti) {
		this.yingwenbiaoti = yingwenbiaoti;
	}
	
	/**
	 * 获取：英文标题
	 */
	public String getYingwenbiaoti() {
		return yingwenbiaoti;
	}
				
	
	/**
	 * 设置：英文内容
	 */
	 
	public void setYingwenneirong(String yingwenneirong) {
		this.yingwenneirong = yingwenneirong;
	}
	
	/**
	 * 获取：英文内容
	 */
	public String getYingwenneirong() {
		return yingwenneirong;
	}
				
	
	/**
	 * 设置：正文
	 */
	 
	public void setZhengwen(String zhengwen) {
		this.zhengwen = zhengwen;
	}
	
	/**
	 * 获取：正文
	 */
	public String getZhengwen() {
		return zhengwen;
	}
				
	
	/**
	 * 设置：电子档
	 */
	 
	public void setDianzidang(String dianzidang) {
		this.dianzidang = dianzidang;
	}
	
	/**
	 * 获取：电子档
	 */
	public String getDianzidang() {
		return dianzidang;
	}
			
}
