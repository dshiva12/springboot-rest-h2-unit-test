package com.shiva.springboot.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String course;

}
