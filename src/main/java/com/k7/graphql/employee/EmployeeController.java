package com.k7.graphql.employee;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @QueryMapping
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @QueryMapping
    public Employee findOne(@Argument Integer id){
        return employeeService.findOne(id);
    }

    @MutationMapping
    public Employee create(@Argument String name, @Argument int age,@Argument String city){
        return employeeService.create(name,age,city);
    }
}
