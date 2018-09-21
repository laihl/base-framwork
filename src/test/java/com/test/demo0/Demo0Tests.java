package com.test.demo0;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class Demo0Tests {
    @Test
        public void daoLoadText() {
        Jedis jds = new Jedis("127.0.0.1",6379,60000);
        jds.auth("123");
        System.out.println(jds.get("a"));

        jds.close();

    }

  

}
