package me.test;

import org.apache.ibatis.session.SqlSession;

import me.domain.Classes;

public class Test {
	
	public static void main(String[] args){
//		一对一的关联
		testGetClassesById1();//方式1
		testGetClassesById2();//方式2
//		一对多的关联
		testGetClassesById3();
		testGetClassesById4();
	}
//	一对一的连表查询
	public static void testGetClassesById1(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		String statement = "me.mapping.classMapper.getClass";
		Classes result = sqlSession.selectOne(statement,1);
		sqlSession.close();
		System.out.println("方式1："+result);
	}
//	一对一的多次查询
	public static void testGetClassesById2(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		String statement = "me.mapping.classMapper.getClass2";
		Classes result = sqlSession.selectOne(statement,1);
		sqlSession.close();
		System.out.println("方式2："+result);
	}
	
//	一对多的连表查询
	public static void testGetClassesById3(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		String statement = "me.mapping.classMapper.getClass3";
		Classes c = sqlSession.selectOne(statement,1);
		sqlSession.close();
		System.out.println("一对多方式1："+c);
	}
//	一对多的多次查询
	public static void testGetClassesById4(){
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		String statement = "me.mapping.classMapper.getClass4";
		Classes c = sqlSession.selectOne(statement,1);
		sqlSession.close();
		System.out.println("一对多方式2："+c);
	}
}
