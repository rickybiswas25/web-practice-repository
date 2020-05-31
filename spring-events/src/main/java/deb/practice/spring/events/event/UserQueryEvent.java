package deb.practice.spring.events.event;

import deb.practice.spring.events.model.User;
import deb.practice.spring.events.model.Users;

import java.util.List;

/**
 * Created by Deb
 * Date : 31/05/2020.
 */
public class UserQueryEvent {
    private final Users users;

    public UserQueryEvent(Users users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users.getUsers();
    }
}
