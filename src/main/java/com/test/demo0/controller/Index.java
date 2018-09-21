package com.test.demo0.controller;

import com.test.demo0.configraction.ConfigBean;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class})
@Api(description = "index默认")
public class Index {
    @Value("${sysconfig.name}")
    private String name;
    @Autowired
    private ConfigBean configBean;
    @RequestMapping(value="/",method = RequestMethod.GET)
    public @ResponseBody String index(){
        return "this sys's name is "+ name +"======>name:"+configBean.getName()+";"+configBean.getWriter();
    }

}
