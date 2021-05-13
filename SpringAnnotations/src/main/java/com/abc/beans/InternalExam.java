package com.abc.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InternalExam extends Examination{
	@Value("25")
	private int totalmarks;

	public InternalExam() {
		super();
	}

	public InternalExam(int totalmarks) {
		super();
		this.totalmarks = totalmarks;
	}

	public int getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}

	@Override
	public String toString() {
		return "InternalExam [totalmarks=" + totalmarks + "]";
	}
	
	

}
