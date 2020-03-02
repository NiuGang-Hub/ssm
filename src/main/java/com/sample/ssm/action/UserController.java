package com.sample.ssm.action;

import com.sample.ssm.model.UserInfo;
import com.sample.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yuyufeng
 * @date 2018/8/24.
 */
@Controller
public class UserController {


    @Autowired
    //定义service接口
    private IUserService userService;

    //用户登录时间输出
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //映射默认路径
    @RequestMapping("")
    private String Login() {
        return "Login";
    }

    //表单登录后映射到user路径，id password 提交到 toUser控制器
    //正确登录返回Login页面，否则返回user路径
    @RequestMapping("/user")
    private String toUser(Model model,@RequestParam("userid") Integer userId,@RequestParam("password")String password){
        UserInfo userInfo = userService.getUserInfoByUserId(userId);
        if(userInfo.getPassword().equals(password)){
            model.addAttribute("user", userInfo);
            System.out.println("用户: "+userInfo.getUserName()+" 于"+df.format(new Date())+"登录");
            return "user";
        }
        else return "Login";
    }

    @RequestMapping("/create")
    private String create(){ return "cre"; }

    @RequestMapping("/createUser")
    private String createUser(Model model,@RequestParam("username")String username, @RequestParam("password")String password ){
        int userInfocreok = userService.insertOne(username,password);
        UserInfo userInfo = userService.getUserInfoByUserName(username);
        model.addAttribute("user", userInfo);
        return "creok";
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        //将登陆的用户名和购物车数量从session中remove
        request.getSession().removeAttribute("user");
        return "user";
    }
}
