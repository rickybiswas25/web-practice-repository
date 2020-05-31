package deb.practice.spring.events.listner;

import deb.practice.spring.events.event.UserRemovedEvent;
import deb.practice.spring.events.listner.UserQueryListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by Deb
 * Date : 31/05/2020.
 */
@Component
public class UserRemovedListener {
    private static final Logger LOG = LoggerFactory.getLogger(UserQueryListener.class);

    @EventListener
    public void userQueryListener(UserRemovedEvent event) {
        LOG.info("User removed {}", event.getUsers().getName());
    }
}
