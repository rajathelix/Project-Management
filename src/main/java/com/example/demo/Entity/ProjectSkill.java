package com.example.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class ProjectSkill {

    @Id
    @GeneratedValue
    private long id;
    @Column(name = "project_id")
    private long projectId;
    @ManyToOne(targetEntity = Skills.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "skill_id",referencedColumnName = "skill_id")
    private Skills skill;

    public ProjectSkill(long projectId, Skills skill){
        this.projectId=projectId;
        this.skill=skill;

    }


}
