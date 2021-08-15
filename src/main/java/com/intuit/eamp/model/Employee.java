package com.intuit.eamp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Employee implements Serializable {

    @Id
    private long employeeId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @OneToMany(mappedBy = "employeeId")
    private List<Role> roles;

    @OneToOne
    @JoinColumn(name = "managerId", nullable = false)
    private Employee managerId;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Employee getManagerId() {
        return managerId;
    }

    public void setManagerId(Employee managerId) {
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
