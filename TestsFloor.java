package algoFamilyFloorCalculation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class TestsFloor {
	
	@Test
	public void testCalculateFloorSquare() throws Exception {
		
		FloorCalculation fcs = new FloorCalculationSquare();
		double result = fcs.calculateFloor(2.554, 7.88);
		
		assertEquals(20.12, result, 0.01);
	}
	
	@Test
	public void testCalculateFloorCircle() throws Exception {
		
		FloorCalculation fcc = new FloorCalculationCircle();
		double pi = Math.PI;
		double result =fcc.calculateFloor(3.141592, pi);
		
		assertEquals(19.73, result, 0.01);
	}

}
