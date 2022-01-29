package com;

//import org.springframework.boot.SpringApplication;

//import org.springframework.boot.autoconfigure.SpringBootApplication;

public class FirstprojectApplication {

	String name;
	int id;

	@Override
	public String toString() {
		return "FirstprojectApplication [name=" + name + ", id=" + id + "]";
	}

	public FirstprojectApplication(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public void displayInfo() {
		System.out.println(name);
		System.out.println(id);
	}

	public static void main(String[] args) {

		FirstprojectApplication obj = new FirstprojectApplication("Tom", 03);
		obj.displayInfo();

		System.out.println(obj);
		
	}
	}
	
