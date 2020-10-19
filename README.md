

See the [中文文档](https://github.com/alibaba/Sentinel/wiki/%E4%BB%8B%E7%BB%8D) for document in Chinese.

See the [Wiki](https://github.com/alibaba/Sentinel/wiki) for full documentation, examples, blog posts, operational details and other information.
#####微服务改造

    加依赖

    <dependency>
        <groupId>com.alibaba.csp</groupId>
        <artifactId>sentinel-datasource-nacos</artifactId>
    </dependency>

#####配置
####
    spring:
      cloud:
        sentinel:
          datasource:
            # 名称随意
            flow:
            nacos:
                server-addr: localhost:8848
                dataId: ${spring.application.name}-flow-rules
                groupId: SENTINEL_GROUP
                # 规则类型，取值见：
                # org.springframework.cloud.alibaba.sentinel.datasource.RuleType
                rule-type: flow
            degrade:
            nacos:
                server-addr: localhost:8848
                dataId: ${spring.application.name}-degrade-rules
                groupId: SENTINEL_GROUP
                rule-type: degrade
            system:
            nacos:
                server-addr: localhost:8848
                dataId: ${spring.application.name}-system-rules
                groupId: SENTINEL_GROUP
                rule-type: system
            authority:
            nacos:
                server-addr: localhost:8848
                dataId: ${spring.application.name}-authority-rules
                groupId: SENTINEL_GROUP
                rule-type: authority
            param-flow:
            nacos:
                server-addr: localhost:8848
                dataId: ${spring.application.name}-param-flow-rules
                groupId: SENTINEL_GROUP
                rule-type: param-flow

本文参考 https://www.imooc.com/article/details/id/289464
