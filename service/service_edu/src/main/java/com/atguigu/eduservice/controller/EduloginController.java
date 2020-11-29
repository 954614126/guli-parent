package com.atguigu.eduservice.controller;

import com.atguigu.commonutils.R;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eduservice/user")
@CrossOrigin //解决跨域  1.前后端的协议(http/htpps ) 2.ip 3.端口号 有一个不同 都会出现跨域问题
public class EduloginController {
    //请求方式会对应前端的login.js中的方法
    //并且他的login()和info()方法中传参都得对应上
    @PostMapping("/login")
    public R login(){
        return R.ok().data("token","admin");
    }

    /*
     * 向前端传递三个参数,
     * roles 登入的身份 管理员 游客 ...
     * name
     * avator 头像
     */
    @GetMapping("/info")
    public R info(){
        return R.ok().data("roles","[admin]").data("name","admin").data("avator","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }
}
