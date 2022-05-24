package com.example.demo.Service;

import com.example.demo.Dao.EmployeeRepository;
import com.example.demo.Dao.ProjectRepository;
import com.example.demo.Dao.ProjectSkillRepository;
import com.example.demo.Dto.CreateProjectRequest;
import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Project;
import com.example.demo.Entity.ProjectSkill;
import com.example.demo.Entity.Skills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private ProjectSkillRepository projectSkillRepository;

    public Employee getEmployeeDetails(final long id){
        return employeeRepository.findById(id).get();
    }

    public Long createEmployee(Employee employee){
        return employeeRepository.save(employee).getId();
    }

    public Long createProject(CreateProjectRequest project){
        Project proj = projectRepository.save(project.getProject());
        List<ProjectSkill> skillList= new ArrayList<ProjectSkill>();
        for (long i:project.getSkills()){
            ProjectSkill skill= new ProjectSkill(proj.getId(),new Skills(i));
            skillList.add(skill);
        }
        proj.setProjectSkill(skillList);
        proj = projectRepository.save(project.getProject());
        return proj.getId();
    }

    public Project getProject(long id){
        return projectRepository.findById(id).get();
    }
}
