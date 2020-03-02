package com.sample.ssm.mapper;

import com.sample.ssm.model.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author yuyufeng
 * @date 2018/8/24.
 */
@SuppressWarnings("ALL")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserInfoMapperTest {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Test
    public void testSelectOne(){
        UserInfo userInfo = userInfoMapper.selectOne(3);
    }

    @Test
    public void testinsertOne(){
        int userInfo= userInfoMapper.insertOne("用户16","1");
        System.out.println(userInfo);
    }


    @Test
    public void testDel(){
        int userInfo= userInfoMapper.delUser(114);
    }

    @Test
    public void testUpData(){
        int userInfo = userInfoMapper.upDataUserPassword(1,"789456123");
    }

    @Test
    public void testSelectByUserName(){
        UserInfo userInfo = userInfoMapper.selectByUserName("用户15");
        System.out.println(userInfo.getUserId());
    }
}
