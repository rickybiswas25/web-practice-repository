package deb.practice.spring.security.repository;

import deb.practice.spring.security.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by Deb
 * Date : 16/07/2020.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByName(String name);
}
