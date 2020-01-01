package com.liisyu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class MybatisDemoTest {
    // 这里必须指明bean的属性名,因为会产生两个bean
    @Resource(name="userMapper")
    IUserMapper mapper;

    @Test
    public void useSpringMybatis(){
        try{
            User user = mapper.query();
            System.out.println(user.toString());
            mapper.insert(new User(3,"max"));

        }catch (Exception e){
            e.printStackTrace();
        }finally {
        }
    }
}