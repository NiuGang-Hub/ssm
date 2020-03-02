package com.sample.ssm.mapper;

import com.sample.ssm.model.UserInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @author yuyufeng
 * @date 2018/8/24.
 */
public interface UserInfoMapper {
    /**
     * 根据ID获取单个对象
     * @param userId
     * @return
     */
    //根据id查用户
    UserInfo selectOne(@Param("userId") Integer userId);
    //创建用户
    int insertOne(@Param("userName") String userName, @Param("password") String password);
    //根据id删除用户
    int delUser(@Param("userId")Integer userId);
    //根据id更改密码
    int upDataUserPassword(@Param("userId")Integer userId,@Param("password") String password);
    //根据name查用户
    UserInfo selectByUserName(String userName);
}
