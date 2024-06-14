package FigureFamily;

import algoFamilyFloorCalculation.FloorCalculationSquare;
import algoFamilySurfaceCalculation.SurfaceCalculationCube;
import algoFamilyVolumeCalculation.VolumeCalculationCube;

public class Cuboid extends Figure{
	
	public Cuboid (double length, double width, double height) {
		super ();
		this.length = length;
		this.width = width;
		this.height = height;
		
		floorCalculation = new FloorCalculationSquare();
		surfaceCalculation = new SurfaceCalculationCube();
		volumeCalculation = new VolumeCalculationCube();
	}

}
