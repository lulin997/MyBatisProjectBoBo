package com.wangqingbo.mapper;

import java.util.List;

import com.wangqingbo.entity.Orders;
import com.wangqingbo.entity.UserInfo;

/**
 * 关联关系映射接口
 * @author Administrator
 *
 */
public interface RelationMapper
{

	/**
	 * 查询所有订单和订单所属的用户
	 * @return 订单列表
	 */
	List<Orders> queryOrderUsers();
	
	/**
	 * 查询订单和订单详情，一对多的关系
	 * @return 订单列表
	 */
	List<Orders> queryOrderDetails();
	
	/**
	 * 查询用户和用户购买的商品
	 * @return 用户列表
	 */
	List<UserInfo> queryUserAndItems();
}
