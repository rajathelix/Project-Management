package com.example.demo.Dto;

import com.example.demo.Entity.Project;
import com.example.demo.Entity.Skills;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CreateProjectRequest {
    private Project project;
    private List<Long> skills;
}
