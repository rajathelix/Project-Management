package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Skills {
    @Id
    @Column(name = "skill_id")
    @GeneratedValue
    private long id;
    @Column(name = "skill")
    private String skill;
    @OneToMany(targetEntity = ProjectSkill.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "skill_id",referencedColumnName = "skill_id")
    private List<ProjectSkill> projectSkill;

    public Skills(long id){
        this.id=id;
    }
}
