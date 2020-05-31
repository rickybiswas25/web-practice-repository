package deb.practice.spring.events.listner;

import deb.practice.spring.events.event.UserQueryEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by Deb
 * Date : 31/05/2020.
 */
@Component
public class UserQueryListener {
    private static final Logger LOG = LoggerFactory.getLogger(UserQueryListener.class);

    @EventListener
    public void userQueryListener(UserQueryEvent event) {
        LOG.info("Total User returned {}", event.getUsers().size());
    }
}
