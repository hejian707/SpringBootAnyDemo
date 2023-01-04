package com.hjt.config;

import com.hjt.constant.RocketMqConstant;
import lombok.Data;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.apache.rocketmq.spring.support.RocketMQMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @author FrozenWatermelon
 * @date 2021/3/30
 */
@RefreshScope
@Configuration
@Data
public class RocketMqAdapter {

    @Autowired
    private RocketMQMessageConverter rocketMqMessageConverter;

    @Value("${rocketmq.name-server:}")
    private String nameServer;

    public RocketMQTemplate getTemplateByTopicName(String topic) {
        RocketMQTemplate mqTemplate = new RocketMQTemplate();
        DefaultMQProducer producer = new DefaultMQProducer(topic);
        producer.setNamesrvAddr(nameServer);
        producer.setRetryTimesWhenSendFailed(2);
        producer.setSendMsgTimeout((int) RocketMqConstant.TIMEOUT);
        mqTemplate.setProducer(producer);
        mqTemplate.setMessageConverter(rocketMqMessageConverter.getMessageConverter());
        return mqTemplate;
    }

}
