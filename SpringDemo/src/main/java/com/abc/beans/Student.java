package com.abc.beans;

import java.util.List;

public class Student {

	private int Id;
	private String name;
	private int age;
	private int marks;
	private Courses course;
	private List<Examination> examList;
	
	public Student() {
		super();
	}



	public Student(int id, String name, int age, int marks, Courses course, List<Examination> examList) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.course = course;
		this.examList = examList;
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



	public List<Examination> getExamList() {
		return examList;
	}



	public void setExamList(List<Examination> examList) {
		this.examList = examList;
	}



	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", course=" + course
				+ ", examList=" + examList + "]";
	}
	
	public void doInit()
	{
		System.out.println(" inside doInit");
	}
	public void doEnd()
	{
		System.out.println("inside doEnd");
	}


}
