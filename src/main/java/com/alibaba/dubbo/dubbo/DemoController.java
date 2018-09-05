package com.alibaba.dubbo.dubbo;

import com.alibaba.dubbo.dubbo.Imp.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.alibaba.dubbo.config.annotation.Reference;

@Controller
public class DemoController {

    @Reference//引入服务
    private DemoService demoService;

    @RequestMapping("/dubboTest")
    public void rest(){
        System.out.println("+++++++++++++++++++++++++++");
        demoService.getPermissions(1L);

    }



}