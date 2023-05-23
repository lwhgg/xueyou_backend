package com.lwh.xueyou.service;

import org.junit.jupiter.api.Test;
import org.redisson.api.RList;
import org.redisson.api.RedissonClient;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;

@SpringBootTest
public class RedissonTest {

    @Resource
    private RedissonClient redissonClient;

    @Test
    void testList() {
        // list
        ArrayList<String> list = new ArrayList<>();
        list.add("lwh");
        System.out.println("list -> " + list.get(0));
    }

    @Test
    void testRlist() {
        RList<String> rlist = redissonClient.getList("test-list");
        rlist.add("lwh");
        System.out.println("rlist -> " + rlist.get(0));
    }
}
