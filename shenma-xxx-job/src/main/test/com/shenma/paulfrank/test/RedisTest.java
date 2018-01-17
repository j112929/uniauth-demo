package com.shenma.paulfrank.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.shenma.ShenmaComponentApplication;
import com.shenma.base.enums.RedisMode;
import com.shenma.base.redis.RedisBuild;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShenmaComponentApplication.class)
public class RedisTest {
	
	@Test
	public void putRedisTest() {
		RedisBuild.getBuild(RedisMode.JEDIS).pubObj("key", "hello");
	}
	@Test
	public void getRedisTest() {
		System.out.println(RedisBuild.getBuild(RedisMode.JEDIS).getObj("key"));
	}
	
}
