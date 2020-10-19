//package com.alibaba.csp.sentinel.dashboard.rule.redis;
//
//import com.fasterxml.jackson.annotation.JsonAutoDetect;
//import com.fasterxml.jackson.annotation.PropertyAccessor;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//import org.springframework.stereotype.Component;
//
//import java.util.concurrent.TimeUnit;
//
///**
// * *
// * TODO
// *
// * @author xlonny_wang@163.com
// * @date 2020/8/29 11:23
// **/
//@Component
//public class RedisConfig  {
////    @Autowired
////    RedisTemplate<String, Object> redisTemplate;
////    @Bean
////    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory)
////    {
////        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
////        redisTemplate.setConnectionFactory(factory);
////        // 打开事务
////        redisTemplate.setEnableTransactionSupport(true);
////        // 使用Jackson2JsonRedisSerializer来序列化和反序列化redis的value值
////        Jackson2JsonRedisSerializer serializer = new Jackson2JsonRedisSerializer(Object.class);
////
////        ObjectMapper mapper = new ObjectMapper();
////        mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
////        serializer.setObjectMapper(mapper);
////
////        redisTemplate.setValueSerializer(serializer);
////        // 使用StringRedisSerializer来序列化和反序列化redis的key值
////        redisTemplate.setKeySerializer(new StringRedisSerializer());
////        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
////        redisTemplate.setHashValueSerializer(serializer);
////        redisTemplate.afterPropertiesSet();
////        return redisTemplate;
////    }
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//
//    public StringRedisTemplate getStringRedisTemplate() {
//        return stringRedisTemplate;
//    }
//
//    /**
//     * 存放string类型
//     *
//     * @param key
//     * @param data
//     * @param timeout
//     */
//    public void setString(String key, String data, Long timeout) {
//        try {
//            stringRedisTemplate.opsForValue().set(key, data, 7, TimeUnit.DAYS);
//            if (timeout != null) {
//                stringRedisTemplate.expire(key, timeout, TimeUnit.SECONDS);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * 存放string类型
//     *
//     * @param key
//     * @param data
//     */
//    public void setString(String key, String data) {
//        setString(key, data, null);
//    }
//
//    /**
//     * 根据key查询string类型
//     *
//     * @param key
//     * @return
//     */
//    public String getString(String key) {
//        String value = stringRedisTemplate.opsForValue().get(key);
//        return value;
//    }
//
//    /**
//     * 根据对应的key删除key
//     *
//     * @param key
//     */
//    public Boolean delKey(String key) {
//        return stringRedisTemplate.delete(key);
//    }
//
//}
