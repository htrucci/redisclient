package com.htrucci.redisclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import redis.clients.jedis.Jedis;

import java.util.List;

@SpringBootApplication
public class RedisclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisclientApplication.class, args);
        Jedis jedis = new Jedis("htrucci.com", 6379, 1000);
        //jedis.set("htrucci","connection success");
        System.out.println(jedis.get("htrucci"));

        //List
        jedis.lpush("htrucciList", "황");
        jedis.lpush("htrucciList", "교");
        jedis.lpush("htrucciList", "빈");

        List<String> list = jedis.lrange("htrucciList", 0, 3);
        for(int i=0; i<list.size(); i++){
            System.out.println("Stored List in Redis :: " + list.get(i));
        }
	}
}
