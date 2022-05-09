package com.openclassroom.webapp.service;

import com.openclassroom.webapp.model.Employee;
import com.openclassroom.webapp.repository.EmployeeProxy;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Data
@Service
public class EmployeeService {
    @Autowired
    private EmployeeProxy employeeProxy;

    public Iterable<Employee> getEmployees() {
        return employeeProxy.getEmployees();
    }

    public Employee getEmployee(final int id){
        return employeeProxy.getEmployee(id);
    }

    public void deleteEmployee(final int id){
        employeeProxy.deleteEmployee(id);
    }

    public Employee saveEmployee (Employee employee){
        Employee savedEmployee;

        // Règle de gestion : Le nom de famille doit être mis en majuscule.
        employee.setLastName(employee.getLastName().toUpperCase());

        if (employee.getId() == null){
            savedEmployee = employeeProxy.createEmployee(employee);
        }
        else {
            savedEmployee = employeeProxy.updateEmployee(employee);
        }

        return savedEmployee;

    }


}

