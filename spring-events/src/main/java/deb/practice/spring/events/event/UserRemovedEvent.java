package deb.practice.spring.events.event;

import deb.practice.spring.events.model.User;
import deb.practice.spring.events.model.Users;

import java.util.List;

/**
 * Created by Deb
 * Date : 31/05/2020.
 */
public class UserRemovedEvent {
    private final User user;

    public UserRemovedEvent(User user) {
        this.user = user;
    }

    public User getUsers() {
        return user;
    }
}
