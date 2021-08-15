package com.intuit.eamp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccessRequest {

    @Id
    private long requestId;

    @Column
    private long employeeId;

    @Column
    private long appId;

    @Column
    private long managerId;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public long getAppId() {
        return appId;
    }

    public void setAppId(long appId) {
        this.appId = appId;
    }

    public long getManagerId() {
        return managerId;
    }

    public void setManagerId(long managerId) {
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return "AccessRequest{" +
                "employeeId=" + employeeId +
                ", appId=" + appId +
                ", managerId=" + managerId +
                '}';
    }
}
