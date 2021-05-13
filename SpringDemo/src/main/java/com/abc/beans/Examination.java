package com.abc.beans;

public class Examination {
	private int examId;
	private String examName;
	
	public Examination() {
		super();
	}

	public Examination(int examId, String examName) {
		super();
		this.examId = examId;
		this.examName = examName;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	@Override
	public String toString() {
		return "Examination [examId=" + examId + ", examName=" + examName + "]";
	}
	

}
