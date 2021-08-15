package com.intuit.eamp.service;

import com.intuit.eamp.dao.AccessRequestRepository;
import com.intuit.eamp.dao.EmployeeRepository;
import com.intuit.eamp.model.AccessRequest;
import com.intuit.eamp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    AccessRequestRepository accessRequestRepository;

    public Employee getEmployee(String employeeId) {
        Employee employee = null;
        try {
            long id = Long.parseLong(employeeId);
            employee = employeeRepository.findById(id).get();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return employee;
    }

    public AccessRequest addAccessRequest(AccessRequest accessRequest) {
        AccessRequest response = null;
        try {
            response = accessRequestRepository.save(accessRequest);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return response;
    }
}
