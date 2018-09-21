package com.test.demo0;

import com.test.demo0.repository.RedisDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import java.net.MalformedURLException;
import java.net.URL;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Demo0ApplicationTests {
//    @LocalServerPort
//    private int port;
//    private URL base;
//    @Autowired
//    private TestRestTemplate template;
//    @Before
//    public void setUp() throws MalformedURLException {
//        this.base = new URL("http://localhost:"+port+"/redis/set/str1/海龙");
//
//    }
//    @Test
//    public void contextLoads() {
//        ResponseEntity<String> respomse = template.getForEntity(base.toString(), String.class);
//
//        System.out.println("====================");
//        System.out.println(respomse.toString());
//        System.out.println("====================");
//    }

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Test
    public void daoLoadText() {
        stringRedisTemplate.opsForValue().set("a","hailong");

    }




}
