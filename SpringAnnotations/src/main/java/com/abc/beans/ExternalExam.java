package com.abc.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalExam extends Examination{
	@Value("100")
	private int totalMarks;
	

	public ExternalExam() {
		super();
	}

	public ExternalExam(int totalMarks) {
		super();
		this.totalMarks = totalMarks;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "ExternalExam [totalMarks=" + totalMarks + "]";
	}
	

}
