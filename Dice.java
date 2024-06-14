package FigureFamily;

import algoFamilyFloorCalculation.FloorCalculationSquare;
import algoFamilySurfaceCalculation.SurfaceCalculationCube;
import algoFamilyVolumeCalculation.VolumeCalculationCube;

public class Dice extends Figure{
	
	public Dice (double length) {
		super ();
		this.length = length;
		this.width = length;
		this.height = length;
		
		floorCalculation = new FloorCalculationSquare();
		surfaceCalculation = new SurfaceCalculationCube();
		volumeCalculation = new VolumeCalculationCube();
	}

}