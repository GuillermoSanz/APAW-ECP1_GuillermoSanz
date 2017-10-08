package composite;

import java.util.ArrayList;
import java.util.List;

public class ProjectComposite extends ProjectComponent {

	private String name;
	
	private List<ProjectComponent> projectList;

	public ProjectComposite(String name) {
        this.name = name;
        this.projectList = new ArrayList<>();
    }

    @Override
    public void add(ProjectComponent projectComponent) {
        assert projectComponent != null;
        this.projectList.add(projectComponent);
    }

	@Override
	public void remove(ProjectComponent projectComponent) {
		assert projectComponent != null;
        this.projectList.remove(projectComponent);		
	}
	
	@Override
	public String view() {
		String result = this.name;
		for (ProjectComponent projectComponent : this.projectList) {
			result +=  "[" + projectComponent.view() + "]";
		}
		return result;
	}
}
