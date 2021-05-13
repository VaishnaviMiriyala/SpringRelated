package com.abc.beans;

public class Courses {
	private int course_id;
	private String coursename;
	public Courses() {
		super();
	}
	
	public Courses(int course_id, String coursename) {
		super();
		this.course_id = course_id;
		this.coursename = coursename;
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
