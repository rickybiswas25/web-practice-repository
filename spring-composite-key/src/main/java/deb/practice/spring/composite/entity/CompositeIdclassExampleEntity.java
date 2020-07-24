package deb.practice.spring.composite.entity;

import deb.practice.spring.composite.model.CompositeIdclassExample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * Created by Deb
 * Date : 23/07/2020.
 */
@Entity
@Table(name = "composite_idclass_example_entity")
@IdClass(CompositeIdclassExample.class)
public class CompositeIdclassExampleEntity {
    @Id
    private String accountType;
    @Id
    private String accountNumber;

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
