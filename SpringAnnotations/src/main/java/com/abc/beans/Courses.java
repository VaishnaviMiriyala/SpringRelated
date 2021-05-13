package com.abc.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Courses {
	
	@Value("11")
	private int course_id;
	@Value("Java")
	private String coursename;
	public Courses() {
		super();
	}

	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	@Override
	public String toString() {
		return "Courses [course_id=" + course_id + ", coursename=" + coursename + "]";
	}

}
