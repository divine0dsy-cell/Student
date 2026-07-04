package com.example.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class StudentApplication implements CommandLineRunner {
@Autowired
private StudRepository repository;

	public static void main(String[] args) {

	SpringApplication.run(StudentApplication.class, args);
	}
@Override
	public void run(String...args)throws Exception {

	Student s1 = new Student();
	s1.setName("PINTU");
	s1.setBranch("bcom");
	s1.setPer(1090);

	Student s2 = new Student();

	s2.setName("raju");
	s2.setBranch("bsc");
	s2.setPer(1000);

	System.out.println("student saving");
	repository.save(s1);
	repository.save(s2);
	System.out.println("student saved successfully");

	System.out.println("reading student");

	Optional<Student>  temp=repository.findById(s1.getRoll());

	System.out.println("fount student"+temp);

}
}
