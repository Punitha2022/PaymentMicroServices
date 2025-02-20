package com.sample.test;

public class Employee implements Comparable<Employee>{
private String name;
private int age;
public Employee(String name,int age) {
	this.name=name;
	this.age=age;
}
@Override
	public String toString() {
		return this.name+ " " + this.age;
	}
@Override
public int compareTo(Employee o) {
	return this.name.compareTo(o.name);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
