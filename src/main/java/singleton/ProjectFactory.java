package singleton;

import java.util.HashMap;
import java.util.Map;

import models.Project;

public final class ProjectFactory {

	private static ProjectFactory projectFactory = null;

	private static Map<Long, Project> projectList;

	private ProjectFactory() {
		ProjectFactory.projectList = new HashMap<>();
	}

	public static ProjectFactory getFactory() {
		if (projectFactory == null) {
			projectFactory = new ProjectFactory();
		}
		return projectFactory;
	}

	public static Project getProject(Long key) {
		Project result = ProjectFactory.projectList.get(key);
		return result;
	}

	public void setProject(Project project) {
		ProjectFactory.projectList.put(project.getId(), project);
	}
}
