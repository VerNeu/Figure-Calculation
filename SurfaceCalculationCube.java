package algoFamilySurfaceCalculation;

public class SurfaceCalculationCube implements SurfaceCalculation {

	public double calculateSurface(double length, double width, double height) {
		return (length * width + length * height + width * height) * 2;
	}	

}
