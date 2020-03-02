package com.sample.ssm.service.impl;

import com.sample.ssm.mapper.UserInfoMapper;
import com.sample.ssm.model.UserInfo;
import com.sample.ssm.service.IUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Intellij IDEA.
 * User:  Administrator
 * Date:  2020/3/2
 */
@SuppressWarnings("ALL")
@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserInfoByUserId(Integer userId) {
        return userInfoMapper.selectOne(userId);
    }

    @Override
    public UserInfo getUserInfoByUserName(String userName) {
        return userInfoMapper.selectByUserName(userName);
    }

    @Override
    public int insertOne(String username, String password) {
        return userInfoMapper.insertOne(username,password);
    }

    @Override
    public int delUser(Integer userId) {
        return userInfoMapper.delUser(userId);
    }

    @Override
    public int upDataUserPassword(@Param("userId")Integer userId, @Param("password") String password) {
        return userInfoMapper.upDataUserPassword(userId,password);
    }

}
