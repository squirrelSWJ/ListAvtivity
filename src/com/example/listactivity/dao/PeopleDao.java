package com.example.listactivity.dao;

import android.graphics.drawable.Drawable;

public class PeopleDao {
	
	int age;
	String name,addr,phone_number, office;
	Drawable pic;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public Drawable getPic() {
		return pic;
	}
	public void setPic(Drawable pic) {
		this.pic = pic;
	}
	
	
	
	
	
}
