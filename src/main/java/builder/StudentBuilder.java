package builder;

import java.util.Calendar;

import models.Student;

public class StudentBuilder {
	
	private Student student;

    public StudentBuilder(int id, String dni) {
        this.student = new Student(id, dni);
    }

    public StudentBuilder(int id) {
        this.student = new Student(id);
    }
    
    public StudentBuilder(String dni) {
        this.student = new Student(dni);
    }

    public StudentBuilder name(String name) {
    	student.setName(name);
        return this;
    }

    public StudentBuilder birthday(Calendar birthday) {
    	student.setBirthday(birthday);
        return this;
    }

    public Student build() {
        return student;
    }
}
