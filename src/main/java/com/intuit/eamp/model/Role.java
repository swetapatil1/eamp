package com.intuit.eamp.model;

import com.intuit.eamp.common.ROLE_TYPE;

import javax.persistence.*;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long roleId;

    @Column
    private ROLE_TYPE type;

    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employeeId;

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public ROLE_TYPE getType() {
        return type;
    }

    public void setType(ROLE_TYPE type) {
        this.type = type;
    }

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }
}
