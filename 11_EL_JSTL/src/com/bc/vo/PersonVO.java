package com.bc.vo;

import java.util.Arrays;

public class PersonVO {
	private String name, age, gender, addr;
	private String[] hobby, ani;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public String[] getAni() {
		return ani;
	}
	public void setAni(String[] ani) {
		this.ani = ani;
	}
	@Override
	public String toString() {
		return "PersonVO [name=" + name + ", age=" + age + ", gender=" + gender + ", addr=" + addr + ", hobby="
				+ Arrays.toString(hobby) + ", ani=" + Arrays.toString(ani) + "]";
	}
	
	
}
