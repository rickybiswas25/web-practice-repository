package deb.practice.spring.events.service;

import deb.practice.spring.events.event.UserQueryEvent;
import deb.practice.spring.events.event.UserRemovedEvent;
import deb.practice.spring.events.model.User;
import deb.practice.spring.events.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by Deb
 * Date : 31/05/2020.
 */
@Service
public class UserService {
    private final ApplicationEventPublisher publisher;
    private final Users users;

    @Autowired
    public UserService(ApplicationEventPublisher publisher, Users users) {
        this.publisher = publisher;
        this.users = users;
    }

    public List<User> getAllUsers() {
        publisher.publishEvent(new UserQueryEvent(users));
        return this.users.getUsers();
    }

    public User deleteUser(long id) {
        Optional<User> user = this.users.getUsers().stream().filter(us -> us.getId() == id).findFirst();

        user.ifPresent(value -> {
            this.publisher.publishEvent(new UserRemovedEvent(value));
            this.users.getUsers().remove(value);
        });
        return user.orElse(null);
    }
}
