package com.sample.ssm.service;

import com.sample.ssm.model.UserInfo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Intellij IDEA.
 * User:  Administrator
 * Date:  2020/3/2
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
