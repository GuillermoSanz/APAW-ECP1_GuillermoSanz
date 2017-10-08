package models;

import java.util.Calendar;

public class Student {
	private int id;
	private String dni;
	private String name;
	private Calendar birthday;
	
	public Student(int id, String dni) {
		this.setId(id);
		this.setDni(dni);
	}
	
	public Student(int id) {
		this.setId(id);
	}
	
	public Student(String dni) {
		this.setDni(dni);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getBirthday() {
		return birthday;
	}

	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
}
