package algoFamilySurfaceCalculation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestsSurface {

	@Test
	void testCalculateSurfaceCube() throws Exception {
		SurfaceCalculation scc = new SurfaceCalculationCube();
		double result = scc.calculateSurface(3.6,4.1,5.9);
		
		assertEquals(120.38, result, 0.01);	
	}
	
	@Test
	void testCalculateSurfaceGlobe() throws Exception {
		SurfaceCalculation scg = new SurfaceCalculationGlobe();
		double pi = Math.PI;
		double dummy = 1;
		double result = scg.calculateSurface(4.33,pi,dummy);
		
		assertEquals(235.60, result, 0.01);
	}
	
	@Test
	void testCalculateSurfacePyramide4() throws Exception {
		SurfaceCalculation scp4 = new SurfaceCalculationPyramide4();
		double result = scp4.calculateSurface(5.5,6.3,7.9);
		
		assertEquals(134.12, result,0.01);
	}

}


