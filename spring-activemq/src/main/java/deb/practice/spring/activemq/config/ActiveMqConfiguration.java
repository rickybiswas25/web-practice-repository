package deb.practice.spring.activemq.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.Queue;


/**
 * Created by Deb
 * Date : 20/07/2020.
 */
@Configuration
public class ActiveMqConfiguration {

    @Value("${activeMQ.brokerUrl}")
    private String brokerUrl;

    @Bean
    public Queue getQueue() {
        return new ActiveMQQueue("standalone.queue");
    }

    @Bean
    public ActiveMQConnectionFactory getConnectionFactory() {
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
        factory.setBrokerURL(this.brokerUrl);
        return factory;
    }

    @Bean
    public JmsTemplate getJmsTemplate() {
        return new JmsTemplate(getConnectionFactory());
    }
}
