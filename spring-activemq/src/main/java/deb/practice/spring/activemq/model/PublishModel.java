package deb.practice.spring.activemq.model;

import java.io.Serializable;

/**
 * Created by Deb
 * Date : 20/07/2020.
 */
public class PublishModel implements Serializable {
    private String message;

    public PublishModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
