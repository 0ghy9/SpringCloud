package com.cloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 0ghy9
 * @Date: 2019/12/13
 * @Description:  @RefreshScope这里面的属性有可能会更新的，git中的配置中心变化的话就要刷新，
 *                没有这个注解内，配置就不能及时更新
 */
@RestController
@RefreshScope
public class TestController {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private  String age;
    @RequestMapping("/test")
    public String test(){
        return this.name+this.age;
    }
}
