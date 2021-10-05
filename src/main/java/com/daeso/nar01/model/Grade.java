package com.daeso.nar01.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@ToString
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int grade;
    private int cls;

    @OneToMany
    @JoinColumn(name = "grade_id")
    List<GradeDetail> gradeDetailList;

}
