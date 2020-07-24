package deb.practice.spring.activemq.listner;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by Deb
 * Date : 20/07/2020.
 */
@Component
public class QueueListener {

    @JmsListener(destination = "standalone.queue")
    public void listen(String message) {
        System.out.println("Message found: " + message);
    }
}


