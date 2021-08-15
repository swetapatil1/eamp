package com.intuit.eamp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Application {

    @Id
    private long appId;

    @Column
    private String appName;

}
