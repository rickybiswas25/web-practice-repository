package deb.practice.spring.composite.repository;

import deb.practice.spring.composite.entity.CompositeIdclassExampleEntity;
import deb.practice.spring.composite.model.CompositeIdclassExample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Deb
 * Date : 23/07/2020.
 */
@Repository
public interface CompositeIdClassRepository extends JpaRepository<CompositeIdclassExampleEntity, CompositeIdclassExample> {

}
