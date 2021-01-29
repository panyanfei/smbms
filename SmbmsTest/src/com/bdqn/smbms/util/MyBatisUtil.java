package com.bdqn.smbms.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
private static SqlSessionFactory sqlSessionfactory;
	static{
		String resource="mybatis_config.xml";
		InputStream inputStream ;
		//1-02获取文件流
		try {
			inputStream = Resources.getResourceAsStream(resource);
			//2.创建SqlSessionFactory
			 sqlSessionfactory = new SqlSessionFactoryBuilder().build(inputStream);
			
		}	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public static  SqlSession getSqlsession(){
		return sqlSessionfactory.openSession();
	}
	public static void closeSqlsession(SqlSession session){
		if(session!=null){
			session.close();
		}
	}
}