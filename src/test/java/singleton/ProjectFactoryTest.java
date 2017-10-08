package singleton;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import models.Project;


public final class ProjectFactoryTest {

	private ProjectFactory projectFactory;
	
	@Before
    public void before() {
        projectFactory.setProject(new Project());
    }
	
	@Test
	public void testIsProjectFactory() {
		assertSame(ProjectFactory.getFactory(), ProjectFactory.getFactory());
	}
	
    @Test
    public void testProjectFactoryNotNull() {
        assertNull(ProjectFactory.getFactory());
    }
    
}
