package com.test.demo0.controller;

import com.test.demo0.EntityBeans.User;
import com.test.demo0.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
@Api(value = "asd",description = "用户操作")
public class UserController {

    @Autowired
    private UserService userService;
    @ApiOperation(value = "查询用户",notes = "name：用户名称")
    @ApiImplicitParam(name = "name",dataType = "String",defaultValue = "海龙",paramType = "path")
    @RequestMapping(value = "/queryByName/{name}",method = RequestMethod.GET)
    public @ResponseBody User findUserByName(@PathVariable String name){
        return userService.findByUserName(name);
    }
    @ApiOperation(value = "新增用户",notes="name：用户名称")
    @ApiImplicitParam(name = "name",dataType = "String",defaultValue = "海龙",paramType = "path")
    @RequestMapping(value = "/addByName/{name}",method = RequestMethod.GET)
    public @ResponseBody User addUserByName(@PathVariable String name){
        return userService.addUserByName(name);
    }
}
