package com.example.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class Stud_inject implements Stud_Dependancy {

  private  EntityManager em;

    public Stud_inject(EntityManager em ){

        this.em=em;
    }

    @Override
    @Transactional
    public void save(Student s1) {

         em.persist(s1);
    }

    @Override
    @Transactional
    public Student findById(int rollno) {
       return em.find(Student.class,rollno);
    }
}
