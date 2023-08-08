package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OneToOneMappingApplication implements CommandLineRunner {

	@Autowired
	LaptopRepository laptopRepository;
	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// here laptop is child

//		List<LaptopEntity> laptopList = new ArrayList<>();
//		method 1 for many to one
//		@SuppressWarnings("deprecation")
//		StudentEntity s1 = studentRepository.getById(3);
//		
//		LaptopEntity l1 = new LaptopEntity(1, "Lenovo",s1);
//		LaptopEntity l2 = new LaptopEntity(2, "Accer",s1);
//		laptopList.add(l1);
//		laptopList.add(l2);
//		System.out.println("LaptopEntity : " + laptopList.size());
//
//		 laptopRepository.saveAll(laptopList);
		
		
		//for many to one method 2
//	List<LaptopEntity> laptopList = new ArrayList<>();
//		
//		LaptopEntity l1=new LaptopEntity();
//		l1.setLaptopId(3);
//		l1.setLaptopName("HP");
//		
//		LaptopEntity l2=new LaptopEntity();
//		l2.setLaptopId(2);
//		l2.setLaptopName("Lenovo");
//		
//		laptopList.add(l1);
//		laptopList.add(l2);
		
			
		// here student is parent
//		StudentEntity studentEntity = new StudentEntity();
//		studentEntity.setStudentId(2);
//		studentEntity.setStudentName("raj");
//		studentEntity.setStudentCity("ahmedabad");
//		studentEntity.setStudentAge(19);
//		studentEntity.setLaptopEntity(laptopList);
//		
//		l1.setStudentEntity(studentEntity);
//		l2.setStudentEntity(studentEntity);
//		
//		studentRepository.save(studentEntity);
		
		
		// for saving laptop entity into student
		// studentEntity.setLaptopEntity(laptopEntity);
		// laptopEntity.setStudentEntity(studentEntity);

	//	For MAny to MAny
		
	
		StudentEntity studentEntity1 = new StudentEntity();
		studentEntity1.setStudentId(1);
		studentEntity1.setStudentName("raj");
	    studentEntity1.setStudentCity("ahmedabad");
        studentEntity1.setStudentAge(19);
		
		StudentEntity studentEntity2 = new StudentEntity();
		studentEntity2.setStudentId(2);
		studentEntity2.setStudentName("ram");
	    studentEntity2.setStudentCity("ahmedabad");
		studentEntity2.setStudentAge(19);
		
		StudentEntity studentEntity3 = new StudentEntity();
		studentEntity3.setStudentId(3);
		studentEntity3.setStudentName("shyam");
	    studentEntity3.setStudentCity("ahmedabad");
		studentEntity3.setStudentAge(19);
		
		
		LaptopEntity l1=new LaptopEntity();
		l1.setLaptopId(1);
		l1.setLaptopName("HP");
		
		LaptopEntity l2=new LaptopEntity();
		l2.setLaptopId(2);
		l2.setLaptopName("Lenovo");
		
		LaptopEntity l3=new LaptopEntity();
		l3.setLaptopId(3);
		l3.setLaptopName("Mac");
		
		
		// student_id 1 has assigned 3 laptops l1,l2,l3
		List<LaptopEntity> laptopList1 = studentEntity1.getLaptopEntity();
		
		laptopList1.add(l1);
		laptopList1.add(l2);
		laptopList1.add(l3);
		
		//student_id 2 has assigned 3 laptops l1,l2,l3
		List<LaptopEntity> laptopList2 = studentEntity2.getLaptopEntity();
		
		laptopList2.add(l1);
		laptopList2.add(l2);
		laptopList2.add(l3);
		
		laptopRepository.saveAll(List.of(l1,l2,l3));
		studentRepository.saveAll(List.of(studentEntity1,studentEntity2,studentEntity3));
		
		//laptops assigned to students
		studentEntity1.setLaptopEntity(laptopList1);
		studentEntity2.setLaptopEntity(laptopList2);
		
//		List<StudentEntity> studentList1=l1.getStudentEntity();
//		studentList1.add(studentEntity1);
//		studentList1.add(studentEntity2);
//		studentList1.add(studentEntity2);
//		
//		List<StudentEntity> studentList2=l2.getStudentEntity();
//		studentList2.add(studentEntity1);
//		studentList2.add(studentEntity2);
//		studentList2.add(studentEntity2);
//		
//		l1.setStudentEntity(studentList1);
//		l2.setStudentEntity(studentList2);
		
	}

}
