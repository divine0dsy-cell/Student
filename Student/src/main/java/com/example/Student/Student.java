package com.example.Student;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table()
public class Student {
    @Id
    private int roll;
    private String name;
    private int per;
    private String branch;
}
