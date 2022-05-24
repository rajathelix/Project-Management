package com.example.demo.Dao;

import com.example.demo.Entity.ProjectSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectSkillRepository extends JpaRepository<ProjectSkill,Long> {
}
