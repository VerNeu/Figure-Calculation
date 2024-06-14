package algoFamilySurfaceCalculation;

public class SurfaceCalculationPyramide4 implements SurfaceCalculation{
	
	public double calculateSurface (double length, double width, double height) {
		
		return length * width + length * Math.sqrt(width * (width/4) + Math.pow(height,2))
							  +	width * Math.sqrt(length * (length/4) + Math.pow(height,2));
	}

}

