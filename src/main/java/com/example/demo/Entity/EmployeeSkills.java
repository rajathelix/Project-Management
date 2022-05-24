package com.example.demo.Entity;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.FetchProfile;

import javax.persistence.*;

@Entity
@Data
public class EmployeeSkills {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne(targetEntity = Employee.class)
    @JoinColumn(name = "employee_id")
    @Fetch(FetchMode.JOIN)
    private long employee_id;

    @ManyToOne(targetEntity = Skills.class)
    @JoinColumn(name = "skill_id")
    @Fetch(FetchMode.JOIN)
    private long skill_id;

}
