package com.example.demo.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue
    @Column(name = "project_id")
    private long id;

    @Column(name = "project_name")
    private String projectName;

    @OneToMany(targetEntity = ProjectSkill.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "project_id", referencedColumnName = "project_id")
    private List<ProjectSkill> projectSkill;

    public Project(String projectName){
        this.projectName=projectName;
    }

}
