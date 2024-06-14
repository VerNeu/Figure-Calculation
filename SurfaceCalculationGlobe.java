package algoFamilySurfaceCalculation;

public class SurfaceCalculationGlobe implements SurfaceCalculation{
	
	public double calculateSurface (double radius, double pi, double dummy) {
		
		return Math.pow(radius,2) * pi * 4 * dummy;
		
	}

}
