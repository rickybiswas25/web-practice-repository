package deb.practice.spring.security.service;

import deb.practice.spring.security.entity.User;
import deb.practice.spring.security.model.StudentUserDetails;
import deb.practice.spring.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by Deb
 * Date : 16/07/2020.
 */
@Service
public class StudentUserService implements UserDetailsService {
    private final UserRepository userRepo;

    @Autowired
    public StudentUserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = this.userRepo.findByName(username);
        if (!user.isPresent()) {
            throw new UsernameNotFoundException("Username / password not found");
        }
        return user.map(StudentUserDetails::new).get();
    }
}
