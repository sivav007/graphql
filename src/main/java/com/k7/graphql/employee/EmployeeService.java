package com.k7.graphql.employee;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class EmployeeService {


    public List<Employee> findAll() {
        return List.of(new Employee(new AtomicInteger(1),"Siva",38,"Piscataway"),
                new Employee(new AtomicInteger(2),"Gupta",38,"Ohio"));
    }

    public Employee findOne(Integer id) {
        return new Employee(new AtomicInteger(id),"Siva",38,"Piscataway");
    }


    public Employee create(String name, int age, String city) {
        return new Employee(new AtomicInteger(90),name,age,city);
    }
}
