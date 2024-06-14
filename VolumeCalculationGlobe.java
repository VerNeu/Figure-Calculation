package algoFamilyVolumeCalculation;

public class VolumeCalculationGlobe implements VolumeCalculation{
	
	public double calculateVolume (double radius, double pi, double dummy) {
		
		return 4 * pi * Math.pow(radius,3) / 3 * dummy;
	}

}
