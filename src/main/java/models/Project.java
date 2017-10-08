package models;

import java.util.ArrayList;
import java.util.List;

public class Project {
	private long id;
	private String title;
	private String description;
	
	private List<Student> students;
	private Size size;
	
	public Project() {
		setListStudent(new ArrayList<Student>());
	}

	public Project(long id) {
		this.id = id;
        this.students = null;
	}
	
	public Project(long id, List<Student> students) {
        this.id = id;
        this.students = students;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Student> getListStudent() {
		return students;
	}

	public void setListStudent(List<Student> listStudent) {
		this.students = listStudent;
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}
	
}
