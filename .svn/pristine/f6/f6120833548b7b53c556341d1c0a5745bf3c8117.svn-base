package com.wangqingbo.test;

import java.io.IOException;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wangqingbo.entity.ProjectInfo;
import com.wangqingbo.mapper.ProjectInfoMapper;

/**
 * 缓存测试类
 * @author Administrator
 */
public class CacheTest
{

	public static void main(String[] args)
	{
		CacheTest t = new CacheTest();
		t.cacheTwoTest();

	}

	/**
	 * 一级缓存测试
	 */
	public void cacheOneTest()
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
			ProjectInfoMapper mapper = session.getMapper(ProjectInfoMapper.class);
			// 调用接口的方法，调用resultType的方式
			ProjectInfo prj1 = mapper.queryProjectInfoById("40288001660e7f5601660e7f59dc0008");
			System.out.println(prj1);
			prj1.setProjectCode("code2018");
			mapper.updateProjectInfo(prj1);
			// 提交事务,清空缓存
			session.commit();
			// 如果没有提交事务，从缓存中取数据，提交事务以后，清空缓存，到数据库中重新查询
			ProjectInfo prj2 = mapper.queryProjectInfoById("40288001660e7f5601660e7f59dc0008");
			System.out.println(prj2);
			// 关闭sqlSession
			session.close();
			// 验证缓存的边界是在sqlSession
			// 创建sqlSession
			SqlSession session2 = factory.openSession();
			// 获取mapper接口,getMapper方法中传一个参数，参数为mapper接口的类
			ProjectInfoMapper mapper2 = session2.getMapper(ProjectInfoMapper.class);
			// 调用接口的方法，调用resultType的方式
			ProjectInfo prj3 = mapper2.queryProjectInfoById("40288001660e7f5601660e7f59dc0008");
			System.out.println(prj3);
			session2.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * 一级缓存测试
	 */
	public void cacheTwoTest()
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
			ProjectInfoMapper mapper = session.getMapper(ProjectInfoMapper.class);
			// 调用接口的方法，调用resultType的方式
			ProjectInfo prj1 = mapper.queryProjectInfoById("40288001660e7f5601660e7f59dc0008");
			System.out.println(prj1);
			// 关闭sqlSession
			session.close();
			// 创建sqlSession
			SqlSession session2 = factory.openSession();
			// 获取mapper接口,getMapper方法中传一个参数，参数为mapper接口的类
			ProjectInfoMapper mapper2 = session2.getMapper(ProjectInfoMapper.class);
			// 调用接口的方法，调用resultType的方式
			ProjectInfo prj2 = mapper2.queryProjectInfoById("40288001660e7f5601660e7f59dc0008");
			System.out.println(prj2);
			session2.close();
			
			// 创建sqlSession
			SqlSession session3 = factory.openSession();
			// 获取mapper接口,getMapper方法中传一个参数，参数为mapper接口的类
			ProjectInfoMapper mapper3 = session3.getMapper(ProjectInfoMapper.class);
			// 调用接口的方法，调用resultType的方式
			ProjectInfo prj3 = mapper3.queryProjectInfoById("40288001660e7f5601660e7f59dc0008");
			System.out.println(prj3);
			session3.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
