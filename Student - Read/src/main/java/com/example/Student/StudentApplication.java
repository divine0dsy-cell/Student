package com.example.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication implements CommandLineRunner {
@Autowired
private StudRepository repository;

public StudentApplication(StudRepository repository){
	this.repository = repository;
}
	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}
@Override
	public void run(String...args)throws Exception {
	Student s1 = new Student();
	System.out.println("Saving data");

	s1.setName("Divya");
	s1.setBranch("IT");
	s1.setPer(89);
	repository.save(s1);

	Student s2= new Student(33,"kartik",92,"civil");
	repository.save(s2);

	Student s3= new Student(45,"shraddha",91,"Cs");
	repository.save(s3);

	Student s4= new Student(60,"alka",90,"Electrical");
	repository.save(s4);

	Student s5= new Student(35,"Suresh",70,"Production");
	repository.save(s5);

	Student s6= new Student(30,"Divine",99,"IT");
	repository.save(s6);

}
}
