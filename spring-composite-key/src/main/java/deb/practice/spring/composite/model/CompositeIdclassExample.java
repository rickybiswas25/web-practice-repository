package deb.practice.spring.composite.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Deb
 * Date : 23/07/2020.
 */
public class CompositeIdclassExample implements Serializable {
    private String accountType;
    private String accountNumber;

    public CompositeIdclassExample() {
    }

    public CompositeIdclassExample(String accountType, String accountNumber) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompositeIdclassExample that = (CompositeIdclassExample) o;
        return Objects.equals(accountType, that.accountType) &&
               Objects.equals(accountNumber, that.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountType, accountNumber);
    }
}
