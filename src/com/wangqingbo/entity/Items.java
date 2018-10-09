package com.wangqingbo.entity;

import java.util.Date;

/**
 * 商品信息
 * @author oracle
 */
public class Items
{
	private String itemId;
	// 商品名称
	private String itemName;
	// 价格
	private Float price;
	// 图片地址
	private String picPath;
	// 创建时间
	private Date createtime;
	// 商品详情
	private String detail;

	public String getItemId()
	{
		return itemId;
	}

	public void setItemId(String itemId)
	{
		this.itemId = itemId;
	}

	public String getItemName()
	{
		return itemName;
	}

	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}

	public Float getPrice()
	{
		return price;
	}

	public void setPrice(Float price)
	{
		this.price = price;
	}

	public String getPicPath()
	{
		return picPath;
	}

	public void setPicPath(String picPath)
	{
		this.picPath = picPath;
	}

	public Date getCreatetime()
	{
		return createtime;
	}

	public void setCreatetime(Date createtime)
	{
		this.createtime = createtime;
	}

	public String getDetail()
	{
		return detail;
	}

	public void setDetail(String detail)
	{
		this.detail = detail;
	}

}
