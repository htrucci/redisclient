package com.htrucci.redisclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by 201410089 on 2017-07-04.
 */
@Service
public class RedisService {
//
//    @Autowired
//    private RedisTemplate<String, String> template;
//    @Resource(name="redisTemplate")
//    private ListOperations<String, String> listOps;
//
//    @Resource(name="redisTemplate")
//    private HashOperations<String, String, String> hashOps;
//
//    @Resource(name="redisTemplate")
//    private SetOperations<String, String> setOps;
//    public List<Member> getMember() {
//
//        RedisOperations<String, String> redis = listOps.getOperations();
//
//        Set<String> keys = redis.keys("sensor*");
//
//        Iterator<String> iter = keys.iterator();
//
//        List<Member> memberList = new ArrayList<Member>();
//
//        while(iter.hasNext()) {
//            String key =  iter.next().toString();
//            int size = (int)(long)redis.opsForList().size(key);
//            for(int i=0; i<size; i++) {
//                Member member = new Member();
//                String[] value =redis.opsForList().leftPop(key).split("_");
//                member.setName(key);
//                member.setAddr(value[0]);
//                member.setNumber(value[1])
//
//                memberList.add(member);
//            }
//        }
//        return memberList;
//    }

}
