package deb.practice.spring.ehcache.repository;

import deb.practice.spring.ehcache.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Deb
 * Date : 22/07/2020.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByName(String name);
}
