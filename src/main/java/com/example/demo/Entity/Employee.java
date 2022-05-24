package com.example.demo.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "employee_id")
    private long id;
    @Column(name = "employee_name")
    private String name;
    public Employee(String name) {
        this.name = name;
    }

}
