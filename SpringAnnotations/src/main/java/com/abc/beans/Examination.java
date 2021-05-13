package com.abc.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public abstract class Examination {
	
	@Value("EEI")
	private String examName;
	@Value("17")
	private int examId;
	
	
	public Examination() {
		super();
	}
	
	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	@Override
	public String toString() {
		return "Examination [examName=" + examName + ", examId=" + examId + "]";
	}
	

}
