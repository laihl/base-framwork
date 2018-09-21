package com.test.demo0.controller;


import com.test.demo0.repository.RedisDao;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/redis")
@Api(description = "redisController相关api")
public class RedisController {

    @Autowired
    private RedisDao redisDao;

    @ApiOperation(value="Redis缓存控制set",notes = "根据kep，Value保存redis数据库")
    @ApiImplicitParams( {
            @ApiImplicitParam(paramType = "query",name = "key",dataType = "String",required = true ,value = "redis键值",defaultValue = "a"),
            @ApiImplicitParam(paramType = "query",name = "value",dataType = "String",required = true ,value = "redis保存值",defaultValue = "hailong")
    })
    @RequestMapping(value="/set",method = RequestMethod.GET)
    public void set( @RequestParam("key") String key , @RequestParam("value") String value){
        redisDao.set(key,value);
    }
    @ApiOperation(value="Redis缓存控制get",notes = "根据kep来redis数据库信息")
    @ApiImplicitParams(
            @ApiImplicitParam(paramType = "query",name = "key",dataType = "String",required = true ,value = "redis键值",defaultValue = "a"))
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public @ResponseBody  String get( @RequestParam("key") String key){
       return redisDao.get(key);
    }

}
