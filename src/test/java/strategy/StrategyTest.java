package strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public final class StrategyTest {

	private AreaCircular areaCircular;
	private AreaTriangulo areaTriangulo;

	@Before
	public void before() {
		areaCircular = new AreaCircular(2);
		areaTriangulo = new AreaTriangulo(2, 3);
	}

	@Test
	public void testAreaCircular() {
		IArea area = areaCircular;
		assertEquals((float) (Math.PI * Math.pow(2, 2)), area.calcularArea(), 0.0001);
	}

	@Test
	public void testAreaTriangular() {
		IArea area = areaTriangulo;
		assertEquals(3, area.calcularArea(), 0.0001);
	}

}
