package com.test.demo0.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

@Repository
public class RedisDao  {

    @Autowired
    private  StringRedisTemplate stringRedisTemplate;
    public  void set(String key,String value){
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
         ops.set(key,value,1, TimeUnit.MINUTES);
    }
    public  void set(String key,String value,int time,TimeUnit timeunit){
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();

        ops.set(key,value,time, timeunit);
    }
    public  String get(String key){

        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        return ops.get(key);
    }
    public  void delete(String key){
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set(key,"",1, TimeUnit.MICROSECONDS);
    }




}
