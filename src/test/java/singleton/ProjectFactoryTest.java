package singleton;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public final class ProjectFactoryTest {
		
	@Test
	public void testIsProjectFactory() {
		assertSame(ProjectFactory.getFactory(), ProjectFactory.getFactory());
	}
	
    @Test
    public void testProjectFactoryNotNull() {
        assertNotNull(ProjectFactory.getFactory());
    }
    
}
