package covea.com.testU;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import covea.mma.service.CalculMath;

public class TestUnitaire {
	
	@Test
	public void testAddition() {
		int a=1;
		int b=2;
		int valeurAttendu=3;
		assertEquals(valeurAttendu, CalculMath._addition(a, b));
	}
}
