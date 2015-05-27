package com.springcore.bean;

import java.util.Date;


public class Answer {
	private int aid;
	private String answer;
	private Date postedDate;

	public String toString() {
		return aid + "\t" + answer + "\t" + postedDate;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Date getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}

}
