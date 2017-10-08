package composite;

import models.Project;

public class ProjectLeaf extends ProjectComponent {
	
	public ProjectLeaf(Project project) {
		this.project = project;
	}

	@Override
	public String view() {
		return String.valueOf(this.project.getId());
	}

	@Override
	public void add(ProjectComponent project) {
		throw new UnsupportedOperationException("Operación no soportada");
	}

	@Override
	public void remove(ProjectComponent project) {
		// Do nothing because is a leaf
	}

}
