package com.intuit.eamp.controller;

import com.intuit.eamp.model.AccessRequest;
import com.intuit.eamp.model.Employee;
import com.intuit.eamp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/{employeeId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable String employeeId) {
        System.out.println("Employee ID is : " + employeeId);
        Employee employee = employeeService.getEmployee(employeeId);
        if (employee != null) {
            return new ResponseEntity<>(employee, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/accessRequest")
    public ResponseEntity addAccessRequest(@RequestBody AccessRequest accessRequest) {
        AccessRequest response = employeeService.addAccessRequest(accessRequest);
        if (response != null) {
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
