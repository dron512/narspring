package com.daeso.nar01.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@ToString
public class GradeDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int clsnum;
    private int name;
    private int isborrow;

    private int grade_id;
}
