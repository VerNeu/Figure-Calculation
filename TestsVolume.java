package algoFamilyVolumeCalculation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestsVolume {

	@Test
	void testCalculateVolumeCube() {
		VolumeCalculation vcc = new VolumeCalculationCube();
		double result = vcc.calculateVolume(5.67,7.333,8.5);
		
		assertEquals(353.41, result, 0.01);
	}
	
	@Test
	void testCalculateVolumeGlobe() {
		VolumeCalculation vcg = new VolumeCalculationGlobe();
		double pi = Math.PI;
		double dummy = 1;
		double result = vcg.calculateVolume(6.986, pi, dummy); 
		
		assertEquals(1428.15, result, 0.01);
	}
	
	@Test
	void testCalculateVolumePyramide4() {
		VolumeCalculation vcp4 = new VolumeCalculationPyramide4();
		double result = vcp4.calculateVolume(2.678, 5.432, 7.5);
		
		assertEquals(36.36, result, 0.01);
	}

}



