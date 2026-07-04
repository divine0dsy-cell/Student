package com.example.Student;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class Stud_inject implements Stud_Dependancy {

    EntityManager em;

    public Stud_inject(EntityManager em ){
        this.em=em;
    }

    @Override
    public void save(Student s1) {
       em.persist(s1);
    }
}
