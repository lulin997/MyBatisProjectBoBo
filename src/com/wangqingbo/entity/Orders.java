package com.wangqingbo.entity;

import java.util.Date;
import java.util.List;

/**
 * 订单信息
 * @author oracle
 */
public class Orders
{
	private String orderId;
	// 用户id
	private String userId;
	// 订单数量
	private String orderNumber;
	// 创建时间
	private Date createtime;
	// 备注
	private String remark;
	// 用户信息，对应resultMap中association标签的property值
	private UserInfo userInfo;
	// 关联订单详情，一对多的关系
	private List<OrderDetail> orderDetails;
	
	public String getOrderId()
	{
		return orderId;
	}

	public void setOrderId(String orderId)
	{
		this.orderId = orderId;
	}

	public String getUserId()
	{
		return userId;
	}

	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	public String getOrderNumber()
	{
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber)
	{
		this.orderNumber = orderNumber;
	}

	public Date getCreatetime()
	{
		return createtime;
	}

	public void setCreatetime(Date createtime)
	{
		this.createtime = createtime;
	}

	public String getRemark()
	{
		return remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public UserInfo getUserInfo()
	{
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo)
	{
		this.userInfo = userInfo;
	}

	public List<OrderDetail> getOrderDetails()
	{
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails)
	{
		this.orderDetails = orderDetails;
	}

}
