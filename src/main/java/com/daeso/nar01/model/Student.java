package com.daeso.nar01.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
public class Student {
    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int grade;

    private int cls;
    private int clsnum;
    private String name;
    private boolean isborrow;
}
