package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class LaptopEntity {
	
           //use when u pass object in laptopentity
	
//	public LaptopEntity(int laptopId, String laptopName, StudentEntity studentEntity) {
//		super();
//		this.laptopId = laptopId;
//		this.laptopName = laptopName;
//		this.studentEntity = studentEntity;
//}

	@Id
	private int laptopId;
	@Column
	private String laptopName;
	

	// for one to one
//   mappedby will take the child entity's object 
	// @OneToOne(mappedBy = "laptopEntity")

	// for many to one
//	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinColumn(name = "student_id")
//	private StudentEntity studentEntity;
//
//	public StudentEntity getStudentEntity() {
//		return studentEntity;
//	}
//
//	public void setStudentEntity(StudentEntity studentEntity) {
//		this.studentEntity = studentEntity;
//	}
	@ManyToMany(fetch = FetchType.LAZY,cascade=CascadeType.ALL,mappedBy = "laptopEntity")
private List<StudentEntity> studentEntity=new ArrayList<StudentEntity>();
	
	
	public List<StudentEntity> getStudentEntity() {
		return studentEntity;
	}

	public void setStudentEntity(List<StudentEntity> studentEntity) {
		this.studentEntity = studentEntity;
	}

	public LaptopEntity() {
	}

	@Override
	public String toString() {
		return "LaptopEntity [laptopId=" + laptopId + ", laptopName=" + laptopName + "]";
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public LaptopEntity(int laptopId, String laptopName) {

		this.laptopId = laptopId;
		this.laptopName = laptopName;
	}

}
