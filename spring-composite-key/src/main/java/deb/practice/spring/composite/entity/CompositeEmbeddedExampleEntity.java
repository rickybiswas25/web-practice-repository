package deb.practice.spring.composite.entity;

import deb.practice.spring.composite.model.CompositeEmbededClassExample;
import deb.practice.spring.composite.model.CompositeIdclassExample;

import javax.persistence.*;

/**
 * Created by Deb
 * Date : 23/07/2020.
 */
@Entity
@Table(name = "composite_embedded_example_entity")
public class CompositeEmbeddedExampleEntity {
    @EmbeddedId
    private CompositeEmbededClassExample account;

    public CompositeEmbededClassExample getAccount() {
        return account;
    }

    public void setAccount(CompositeEmbededClassExample account) {
        this.account = account;
    }
}
