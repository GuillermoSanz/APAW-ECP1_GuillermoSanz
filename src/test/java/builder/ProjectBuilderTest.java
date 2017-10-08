package builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import models.Project;
import models.Student;
import utils.Utils;

public class ProjectBuilderTest {

	@Test
	public void testProjectBuilder() {

		Student juan = new StudentBuilder(1, "12345678").name("Juan").birthday(Utils.getCalendar(05, 06, 2000)).build();
		Student ana = new StudentBuilder(2, "87654321").name("Ana").birthday(Utils.getCalendar(01, 01, 2000)).build();
		Project project = new ProjectBuilder(1, juan).student(ana).title("project1").description("description1")
				.build();

		assertEquals(1, project.getId());
		assertEquals("project1", project.getTitle());
		assertEquals("description1", project.getDescription());
		assertEquals("Juan", project.getListStudent().get(0).getName());
		assertEquals("Ana", project.getListStudent().get(1).getName());
		assertEquals(1, project.getListStudent().get(0).getId());
		assertEquals(2, project.getListStudent().get(1).getId());
		assertEquals("12345678", project.getListStudent().get(0).getDni());
		assertEquals("87654321", project.getListStudent().get(1).getDni());
	}

}
