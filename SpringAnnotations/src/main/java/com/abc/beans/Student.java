package com.abc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Student {
	@Value("${s.Id}")
	private int Id;
	@Value("Ramya")
	private String name;
	@Value("25")
	private int age;
	@Value("#{student.age > 18 ? true:false}")
	private boolean eligibleForVolting;
	@Value("95")
	private int marks;
	@Autowired
	private Courses course;
	@Autowired
	@Qualifier("externalExam")
	private Examination exam;
	
	public Student() {
		super();
	}



	public Student(int id, String name, int age, int marks) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		
	}



	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	public Courses getCourse() {
		return course;
	}



	public void setCourse(Courses course) {
		this.course = course;
	}



	public Examination getExam() {
		return exam;
	}



	public void setExam(Examination exam) {
		this.exam = exam;
	}



	public boolean isEligibleForVolting() {
		return eligibleForVolting;
	}



	public void setEligibleForVolting(boolean eligibleForVolting) {
		this.eligibleForVolting = eligibleForVolting;
	}



	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", age=" + age + ", eligibleForVolting=" + eligibleForVolting
				+ ", marks=" + marks + ", course=" + course + ", exam=" + exam + "]";
	}


	

}
