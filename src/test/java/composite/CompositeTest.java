package composite;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import models.Project;

public class CompositeTest {

	private ProjectComponent root;

	private ProjectComponent sub1;

	private ProjectComponent sub11;

	private ProjectComponent sub12;

	private ProjectComponent leaf;

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Before
	public void ini() {
		this.root = new ProjectComposite("raiz");

		this.leaf = new ProjectLeaf(new Project(1));
		this.root.add(leaf);
		this.sub1 = new ProjectComposite("sub1");
		this.root.add(sub1);
		this.root.add(new ProjectLeaf(new Project(7)));

		this.sub11 = new ProjectComposite("sub11");
		this.sub1.add(sub11);
		this.sub1.add(new ProjectLeaf(new Project(4)));
		this.sub12 = new ProjectComposite("sub12");
		this.sub1.add(sub12);

		this.sub11.add(new ProjectLeaf(new Project(2)));
		this.sub11.add(new ProjectLeaf(new Project(3)));

		this.sub12.add(new ProjectLeaf(new Project(5)));
		this.sub12.add(new ProjectLeaf(new Project(6)));
	}
	
	@Test
	public void TestRootName() {
		ini();
		assertEquals("raiz[1][sub1[sub11[2][3]][4][sub12[5][6]]][7]", root.view());
	}
	
}

