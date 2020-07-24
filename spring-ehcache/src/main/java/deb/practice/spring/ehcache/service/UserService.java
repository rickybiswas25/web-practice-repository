package deb.practice.spring.ehcache.service;

import deb.practice.spring.ehcache.model.User;
import deb.practice.spring.ehcache.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by Deb
 * Date : 22/07/2020.
 */
@Service
public class UserService {

    private final UserRepository repo;

    @Autowired
    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    @Cacheable(value = "squareCache", key = "#name")
    public User findByName(String name) {
        return this.repo.findByName(name);
    }
}
