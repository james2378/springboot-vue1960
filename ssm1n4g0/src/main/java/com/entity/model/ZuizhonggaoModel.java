package com.entity.model;

import com.entity.ZuizhonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 最终稿
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-15 20:03:40
 */
public class ZuizhonggaoModel  implements Serializable {
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
	 * 论文标题
	 */
	
	private String lunwenbiaoti;
		
	/**
	 * 概要
	 */
	
	private String gaiyao;
		
	/**
	 * 电子档
	 */
	
	private String dianzidang;
		
	/**
	 * 正文
	 */
	
	private String zhengwen;
		
	/**
	 * 时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shijian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：论文标题
	 */
	 
	public void setLunwenbiaoti(String lunwenbiaoti) {
		this.lunwenbiaoti = lunwenbiaoti;
	}
	
	/**
	 * 获取：论文标题
	 */
	public String getLunwenbiaoti() {
		return lunwenbiaoti;
	}
				
	
	/**
	 * 设置：概要
	 */
	 
	public void setGaiyao(String gaiyao) {
		this.gaiyao = gaiyao;
	}
	
	/**
	 * 获取：概要
	 */
	public String getGaiyao() {
		return gaiyao;
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
	 * 设置：时间
	 */
	 
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	
	/**
	 * 获取：时间
	 */
	public Date getShijian() {
		return shijian;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
