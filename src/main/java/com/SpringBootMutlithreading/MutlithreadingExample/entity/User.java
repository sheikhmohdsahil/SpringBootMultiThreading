package com.SpringBootMutlithreading.MutlithreadingExample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "USER_TBL")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;
    private String gender;
}
