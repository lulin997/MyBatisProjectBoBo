package com.wangqingbo.entity;

/**
 * 订单详情
 * @author oracle
 */
public class OrderDetail
{
	private String orderDetailId;
	// 订单id
	private String ordersId;
	// 商品id
	private String itemsId;
	// 商品数量
	private Integer itemsNum;
	// 明细对应的商品信息，订单详情和商品的一对一关联
	private Items items;

	public String getOrderDetailId()
	{
		return orderDetailId;
	}

	public void setOrderDetailId(String orderDetailId)
	{
		this.orderDetailId = orderDetailId;
	}

	public String getOrdersId()
	{
		return ordersId;
	}

	public void setOrdersId(String ordersId)
	{
		this.ordersId = ordersId;
	}

	public String getItemsId()
	{
		return itemsId;
	}

	public void setItemsId(String itemsId)
	{
		this.itemsId = itemsId;
	}

	public Integer getItemsNum()
	{
		return itemsNum;
	}

	public void setItemsNum(Integer itemsNum)
	{
		this.itemsNum = itemsNum;
	}

	public Items getItems()
	{
		return items;
	}

	public void setItems(Items items)
	{
		this.items = items;
	}

}
