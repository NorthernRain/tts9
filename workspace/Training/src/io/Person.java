package io;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String gender;
	private int age;
	private String[] otherInfo;

	public Person(String name, String gender, int age, String[] otherInfo) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.otherInfo = otherInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String[] getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(String[] otherInfo) {
		this.otherInfo = otherInfo;
	}

	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", otherInfo="
				+ Arrays.toString(otherInfo) + "]";
	}

}
