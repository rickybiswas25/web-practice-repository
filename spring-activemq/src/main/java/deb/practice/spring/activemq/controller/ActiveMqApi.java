package deb.practice.spring.activemq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

/**
 * Created by Deb
 * Date : 20/07/2020.
 */
@RestController
@RequestMapping("/api/message")
public class ActiveMqApi {

    private final Queue queue;
    private final JmsTemplate jmsTemplate;

    @Autowired
    public ActiveMqApi(Queue queue, JmsTemplate jmsTemplate) {
        this.queue = queue;
        this.jmsTemplate = jmsTemplate;
    }

    @GetMapping("/{message}")
    public String publishMessage(@PathVariable String message) {
        this.jmsTemplate.convertAndSend(queue, message);
        return String.format("Published message %s", message);
    }
}
