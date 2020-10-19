///*
// * Copyright 1999-2018 Alibaba Group Holding Ltd.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *      http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//package com.alibaba.csp.sentinel.dashboard.rule.redis.flow;
//
//import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.FlowRuleEntity;
//import com.alibaba.csp.sentinel.dashboard.rule.DynamicRulePublisher;
//import com.alibaba.csp.sentinel.dashboard.rule.nacos.NacosConfigConstant;
//import com.alibaba.csp.sentinel.dashboard.rule.nacos.NacosConfigUtil;
//import com.alibaba.csp.sentinel.dashboard.rule.redis.RedisConfigConstant;
//import com.alibaba.fastjson.JSONObject;
//import com.alibaba.nacos.api.config.ConfigService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
///**
// * @author itmuch.com
// */
//@Component("flowRuleRedisPublisher")
//public class FlowRuleRedisPublisher  implements DynamicRulePublisher<List<FlowRuleEntity>> {
////    @Autowired
////    private ConfigService configService;
////
////
////    @Override
////    public void publish(String app, List<FlowRuleEntity> rules) throws Exception {
////        NacosConfigUtil.setRuleStringToNacos(
////            this.configService,
////            app,
////            NacosConfigConstant.FLOW_DATA_ID_PREFIX,
////               rules
////        );
////    }
//    @Autowired
//    private RedisTemplate<String, Object> redisTemplate;
//
//
//
//    @Override
//    public void publish(String app, List<FlowRuleEntity> rules) throws Exception {
//        System.out.println("Sentinel 向Redis推送规则 begin >>>>>>>>>>>>>>>>>>>>");
//        if (rules == null){
//            return;
//        }
//        redisTemplate.multi();
//        redisTemplate.opsForValue().set(RedisConfigConstant.FLOW_DATA_ID_PREFIX+app, JSONObject.toJSONString(rules));
//        redisTemplate.convertAndSend(app,rules);
//        redisTemplate.exec();
//        System.out.println("Sentinel 向Redis推送规则 end >>>>>>>>>>>>>>>>>>>>");
//    }
//}
