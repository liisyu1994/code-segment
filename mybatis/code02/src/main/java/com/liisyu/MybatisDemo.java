package com.liisyu;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class MybatisDemo {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        Reader reader = null;
        SqlSession sqlSession = null;
        SqlSessionFactory sqlSessionFactory = null;
        try{
            //获取sqlSession
            reader = Resources.getResourceAsReader(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            sqlSession = sqlSessionFactory.openSession();

            //获取mapper并进行简单操作
            IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);
            User user = mapper.query();
            System.out.println(user.toString());
            mapper.insert(new User(3,"max"));


            //some code
            sqlSession.commit(); //提交
        }catch (Exception e){
           e.printStackTrace();
            sqlSession.rollback();//回滚
        }finally {
            if (sqlSession != null){
                sqlSession.close();
            }
        }
    }
}
