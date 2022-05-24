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
    @Column(name = "skill_id")
    private long skillId;

    public ProjectSkill(long projectId, long skillId){
        this.projectId=projectId;
        this.skillId=skillId;

    }


}
