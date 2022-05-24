package com.example.demo.Controller;

import com.example.demo.Dao.ProjectRepository;
import com.example.demo.Dto.CreateProjectRequest;
import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Project;
import com.example.demo.Entity.ProjectSkill;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/details/{id}")
    public ResponseEntity<Employee> getEmployeeDetails(@PathVariable(value = "id") long id){
        return new ResponseEntity<>(employeeService.getEmployeeDetails(id), HttpStatus.OK);
    }

    @PostMapping(path = "/add")
    public ResponseEntity<Long> createEmployee(@RequestBody Employee details){
        return new ResponseEntity<Long>(employeeService.createEmployee(details),HttpStatus.OK);
    }

    @Transactional
    @PostMapping(path = "/createProject")
    public ResponseEntity<Long> createProject(@RequestBody CreateProjectRequest project){
        return new ResponseEntity<Long>(employeeService.createProject(project),HttpStatus.OK);
    }

    @GetMapping("project/{id}")
    public ResponseEntity<Project> getProject(@PathVariable long id){
        return new ResponseEntity<Project>(employeeService.getProject(id),HttpStatus.OK);
    }
}
