package com.intuit.eamp.model;

import javax.persistence.*;

@Entity
public class Application {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long appId;

    @Column
    private String appName;

}
