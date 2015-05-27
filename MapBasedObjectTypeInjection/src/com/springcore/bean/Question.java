package com.springcore.bean;

import java.util.Map;
import java.util.Set;

public class Question {
	private int qid;
	private String question;
	private Map<Answer, User> answers;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Map<Answer, User> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<Answer, User> answers) {
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println("Question Id : "+qid);
		System.out.println("Question : "+ question);
		System.out.println("Answers : ");
		System.out.println("---------------");
		Set<Answer> ans = answers.keySet();
		for(Answer answer:ans){
			System.out.println(answer+"\n\t\tPosted by : "+answers.get(answer));
			System.out.println("\n");
		}
	}
}
