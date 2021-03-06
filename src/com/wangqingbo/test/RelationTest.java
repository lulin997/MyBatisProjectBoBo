package com.wangqingbo.test;

import java.io.IOException;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wangqingbo.entity.OrderDetail;
import com.wangqingbo.entity.Orders;
import com.wangqingbo.entity.ProjectInfo;
import com.wangqingbo.entity.UserInfo;
import com.wangqingbo.mapper.ProjectInfoMapper;
import com.wangqingbo.mapper.RelationMapper;

/**
 * 关联映射查询
 * @author Administrator
 */
public class RelationTest
{

	public static void main(String[] args)
	{
		RelationTest t = new RelationTest();
		t.queryAllUserAndItems();

	}

	/**
	 * 查询所有的项目信息
	 */
	public void queryAllOrders()
	{
		try
		{
			// 加载配置文件
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			// 创建sqlSessionFactory
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
			// 创建sqlSession
			SqlSession session = factory.openSession();
			// 获取mapper接口,getMapper方法中传一个参数，参数为mapper接口的类
			RelationMapper mapper = session.getMapper(RelationMapper.class);
			// 调用接口的方法，调用resultType的方式
			List<Orders> list = mapper.queryOrderUsers();
			// 打印
			if (list != null && list.size() > 0)
			{
				for (Orders o : list)
				{
					System.out.println(o.getOrderId() + "," + o.getUserInfo().getUserName());
				}
			}

			// 关闭sqlSession
			session.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * 查询所有的项目信息
	 */
	public void queryAllOrdersAndDetail()
	{
		try
		{
			// 加载配置文件
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			// 创建sqlSessionFactory
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
			// 创建sqlSession
			SqlSession session = factory.openSession();
			// 获取mapper接口,getMapper方法中传一个参数，参数为mapper接口的类
			RelationMapper mapper = session.getMapper(RelationMapper.class);
			// 调用接口的方法，调用resultType的方式
			List<Orders> list = mapper.queryOrderDetails();
			// 打印
			if (list != null && list.size() > 0)
			{
				for (Orders o : list)
				{
					System.out.println(o.getOrderId());
					// 订单详情
					List<OrderDetail> odList = o.getOrderDetails();
					if (odList != null && !odList.isEmpty())
					{
						for (OrderDetail od : odList)
						{
							System.out.println(od.getItemsNum());
						}
					}
					System.out.println("***********************************");
				}
			}
			
			// 关闭sqlSession
			session.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * 查询所有的项目信息
	 */
	public void queryAllUserAndItems()
	{
		try
		{
			// 加载配置文件
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			// 创建sqlSessionFactory
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
			// 创建sqlSession
			SqlSession session = factory.openSession();
			// 获取mapper接口,getMapper方法中传一个参数，参数为mapper接口的类
			RelationMapper mapper = session.getMapper(RelationMapper.class);
			// 调用接口的方法，调用resultType的方式
			List<UserInfo> list = mapper.queryUserAndItems();
			// 打印
			if (list != null && list.size() > 0)
			{
				for (UserInfo u : list)
				{
					//输出用户
					System.out.println(u.getUserName());
					for(Orders o:u.getOrdersList())
					{
						for(OrderDetail od:o.getOrderDetails())
						{
							//输出用户购买的商品
							System.out.println(od.getItems().getItemName());
						}
					}
				}
			}
			
			// 关闭sqlSession
			session.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
