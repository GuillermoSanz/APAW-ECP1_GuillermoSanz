package builder;

import java.util.ArrayList;
import java.util.List;

import models.Project;
import models.Student;

public class ProjectBuilder {
	
	private List<Student> studentsList;
	
	private Project project;

    public ProjectBuilder(long id, Student student) {
        List<Student> students = new ArrayList<>();
        students.add(student);
        this.project = new Project(id, students);
    }

    public ProjectBuilder() {
    	this.project = new Project();
    }
    
    public ProjectBuilder(long id) {
        this.project = new Project(id);
    }
    
    public ProjectBuilder id(long id) {
        this.project = new Project(id);
        return this;
    }
    
    public ProjectBuilder student(Student student) {
    	if (this.studentsList == null) {
            this.studentsList = new ArrayList<Student>();
            this.studentsList.add(student);
        }
    	project.addStudent(student);
        return this;
    }
  
    public ProjectBuilder title(String title) {
    	project.setTitle(title);
        return this;
    }

    public ProjectBuilder description(String description) {
    	project.setDescription(description);
        return this;
    }

    public Project build() {
        return project;
    }

}
