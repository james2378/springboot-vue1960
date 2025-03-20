package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 英文材料
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-15 20:03:40
 */
@TableName("yingwencailiao")
public class YingwencailiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YingwencailiaoEntity() {
		
	}
	
	public YingwencailiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
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
