package com.therealdanvega.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class User {

    @Id @GeneratedValue
    private long id;
    private String firstName;
    private int age;

    public User(String first, int age) {
        this.firstName = first;
        this.age = age;
    }

}
