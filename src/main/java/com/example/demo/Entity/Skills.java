package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Skills {
    @Id
    @Column(name = "skill_id")
    @GeneratedValue
    private long id;
    @Column(name = "skill")
    private String skill;
    @OneToMany(targetEntity = ProjectSkill.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "skill_id",referencedColumnName = "skill_id")
    @JsonBackReference
    private List<ProjectSkill> projectSkill;

    public Skills(long id){
        this.id=id;
    }
}
