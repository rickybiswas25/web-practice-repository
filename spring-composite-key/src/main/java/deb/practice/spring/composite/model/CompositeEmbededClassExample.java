package deb.practice.spring.composite.model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Deb
 * Date : 23/07/2020.
 */
@Embeddable
public class CompositeEmbededClassExample implements Serializable {
    private String accountType;
    private String accountNumber;

    public CompositeEmbededClassExample() {
    }

    public CompositeEmbededClassExample(String accountType, String accountNumber) {
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
        CompositeEmbededClassExample that = (CompositeEmbededClassExample) o;
        return Objects.equals(accountType, that.accountType) &&
               Objects.equals(accountNumber, that.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountType, accountNumber);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompositeEmbededClassExample{");
        sb.append("accountType='").append(accountType).append('\'');
        sb.append(", accountNumber='").append(accountNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }

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
