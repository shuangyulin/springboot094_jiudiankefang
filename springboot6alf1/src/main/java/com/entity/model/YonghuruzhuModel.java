package com.entity.model;

import com.entity.YonghuruzhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 用户入住
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-30 10:31:55
 */
public class YonghuruzhuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 客房号
	 */
	
	private String kefanghao;
		
	/**
	 * 客房类型
	 */
	
	private String kefangleixing;
		
	/**
	 * 所属酒店
	 */
	
	private String suoshujiudian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 客房状态
	 */
	
	private String kefangzhuangtai;
		
	/**
	 * 入住押金
	 */
	
	private Float ruzhuyajin;
		
	/**
	 * 支付方式
	 */
	
	private String zhifufangshi;
		
	/**
	 * 入住时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date ruzhushijian;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：客房号
	 */
	 
	public void setKefanghao(String kefanghao) {
		this.kefanghao = kefanghao;
	}
	
	/**
	 * 获取：客房号
	 */
	public String getKefanghao() {
		return kefanghao;
	}
				
	
	/**
	 * 设置：客房类型
	 */
	 
	public void setKefangleixing(String kefangleixing) {
		this.kefangleixing = kefangleixing;
	}
	
	/**
	 * 获取：客房类型
	 */
	public String getKefangleixing() {
		return kefangleixing;
	}
				
	
	/**
	 * 设置：所属酒店
	 */
	 
	public void setSuoshujiudian(String suoshujiudian) {
		this.suoshujiudian = suoshujiudian;
	}
	
	/**
	 * 获取：所属酒店
	 */
	public String getSuoshujiudian() {
		return suoshujiudian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
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
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：客房状态
	 */
	 
	public void setKefangzhuangtai(String kefangzhuangtai) {
		this.kefangzhuangtai = kefangzhuangtai;
	}
	
	/**
	 * 获取：客房状态
	 */
	public String getKefangzhuangtai() {
		return kefangzhuangtai;
	}
				
	
	/**
	 * 设置：入住押金
	 */
	 
	public void setRuzhuyajin(Float ruzhuyajin) {
		this.ruzhuyajin = ruzhuyajin;
	}
	
	/**
	 * 获取：入住押金
	 */
	public Float getRuzhuyajin() {
		return ruzhuyajin;
	}
				
	
	/**
	 * 设置：支付方式
	 */
	 
	public void setZhifufangshi(String zhifufangshi) {
		this.zhifufangshi = zhifufangshi;
	}
	
	/**
	 * 获取：支付方式
	 */
	public String getZhifufangshi() {
		return zhifufangshi;
	}
				
	
	/**
	 * 设置：入住时间
	 */
	 
	public void setRuzhushijian(Date ruzhushijian) {
		this.ruzhushijian = ruzhushijian;
	}
	
	/**
	 * 获取：入住时间
	 */
	public Date getRuzhushijian() {
		return ruzhushijian;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
