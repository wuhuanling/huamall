package com.huamall.config;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.huamall.util.RedisUtil;

/**
 * Redis 配置类
 *
 * 
 */
@Configuration


public class RedisConfiguration {

	
	 @Value("${spring.redis.host:disabled}")
     private  String host;
     
     @Value("${spring.redis.port}")
     private  int port;
     @Value("${spring.redis.database}")
     private int datebase;
@Bean	
public RedisUtil getRedisUtil() {
	if("disabled".equals(host)) {
		return null;
	}
	RedisUtil redisUtil=new RedisUtil();
	redisUtil.initPool(host, port, datebase);
	return redisUtil;
}
     
     
     
   

}
