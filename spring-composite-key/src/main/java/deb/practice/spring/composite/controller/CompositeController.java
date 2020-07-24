package deb.practice.spring.composite.controller;

import deb.practice.spring.composite.entity.CompositeEmbeddedExampleEntity;
import deb.practice.spring.composite.entity.CompositeIdclassExampleEntity;
import deb.practice.spring.composite.repository.CompositeEmbeddedRepository;
import deb.practice.spring.composite.repository.CompositeIdClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Deb
 * Date : 23/07/2020.
 */
@RestController
@RequestMapping("/api")
public class CompositeController {
    private final CompositeEmbeddedRepository embedded;
    private final CompositeIdClassRepository idClassRepository;

    @Autowired
    public CompositeController(CompositeEmbeddedRepository embedded, CompositeIdClassRepository idClassRepository) {
        this.embedded = embedded;
        this.idClassRepository = idClassRepository;
    }

    @GetMapping("/embedded")
    public List<CompositeEmbeddedExampleEntity> findEmbedded() {
        List<CompositeEmbeddedExampleEntity> entities = this.embedded.findAll();
        return entities;
    }

    @GetMapping("/id")
    public List<CompositeIdclassExampleEntity> findIdClass() {
        return this.idClassRepository.findAll();
    }


}
