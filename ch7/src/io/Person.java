package io;

import java.io.Serializable;

public class Person implements Serializable{ //직렬화: 이클립스에 작성한 객체를 파일에 저장하기 위해서
	
	private String name;
	private String job;
	
	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
	
}