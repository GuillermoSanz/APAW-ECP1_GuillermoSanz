package composite;

import models.Project;

public abstract class ProjectComponent {
	
	protected Project project;
	
	public abstract void add(ProjectComponent project);

    public abstract void remove(ProjectComponent project);

    public abstract String view();
}
