package deb.practice.spring.events;

import deb.practice.spring.events.model.User;
import deb.practice.spring.events.model.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Deb
 * Date : 31/05/2020.
 */
@SpringBootApplication
public class SpringEventApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringEventApplication.class, args);
    }

    @Bean
    public Users allUsers() {
        Users users = new Users();
        List<User> allUser = new ArrayList<>();
        allUser.add(new User(1, "Mike"));
        allUser.add(new User(2, "John"));
        allUser.add(new User(2, "Sam"));
        users.setUsers(allUser);
        return users;
    }
}
