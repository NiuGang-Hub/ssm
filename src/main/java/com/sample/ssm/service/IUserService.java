package com.sample.ssm.service;

import com.sample.ssm.model.UserInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @author yuyufeng
 * @date 2018/8/24.
 */
public interface IUserService {
    /**
     * 根据userId获取用户
     * @param userId
     * @return
     */
    UserInfo getUserInfoByUserId(Integer userId);
    UserInfo getUserInfoByUserName(String username);
    int insertOne(String username,String password);
    int delUser(Integer userId);
    int upDataUserPassword(@Param("userId")Integer userId, @Param("password") String password);
}
