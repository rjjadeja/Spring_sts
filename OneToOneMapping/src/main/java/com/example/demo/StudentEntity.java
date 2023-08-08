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
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class StudentEntity {

	@Id
	private int studentId;
	@Column
	private String studentName;
	@Column
	private String studentCity;
	@Column
	private int studentAge;

	// for one to one

	// @joincolumn annotation will join a colum from laptop (child) in the parent
	// entity
	// @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	// @JoinColumn(name = "laptop_id") //write column name from laptop(child) whic
	// already in laptop entity -->(laptop_id)

	// for one to many

//	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "studentEntity")
//
//	private List<LaptopEntity> laptopEntity = new ArrayList<LaptopEntity>();
//
//	public List<LaptopEntity> getLaptopEntity() {
//		return laptopEntity;
//	}
//
//	public void setLaptopEntity(List<LaptopEntity> laptopEntity) {
//		this.laptopEntity = laptopEntity;
//	}
//	
	
	//for many to many
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	
	private List<LaptopEntity> laptopEntity = new ArrayList<LaptopEntity>();

	public List<LaptopEntity> getLaptopEntity() {
		return laptopEntity;
	}

	public void setLaptopEntity(List<LaptopEntity> laptopEntity) {
		this.laptopEntity = laptopEntity;
	}

	public StudentEntity() {
	}

	public StudentEntity(int studentId, String studentName, String studentCity, int studentAge) {

		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "StudentEntity [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ ", studentAge=" + studentAge + "]";
	}

	public StudentEntity(int studentAge) {
		super();
		this.studentAge = studentAge;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

}
