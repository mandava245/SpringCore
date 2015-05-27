package com.springcore.bean;

import java.util.Map;
import java.util.Set;

public class Question {
	private int qid;
	private String question;
	private Map<String, String> answers;
	public Question(int qid,String question,Map<String, String> answers){
		this.qid=qid;
		this.question=question;
		this.answers=answers;
	}
	public void displayInfo(){
		System.out.println("Question Id : "+qid);
		System.out.println("Question : "+question);
		System.out.println("Answers :  ");
		System.out.println("--------------");
		Set<String> keys = answers.keySet();
		for(String key:keys){
			System.out.println(key+"\t Posted by : "+answers.get(key));
		}
	}
}
