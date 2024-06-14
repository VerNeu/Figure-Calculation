package FigureFamily;

import algoFamilyFloorCalculation.FloorCalculationSquare;
import algoFamilySurfaceCalculation.SurfaceCalculationPyramide4;
import algoFamilyVolumeCalculation.VolumeCalculationPyramide4;

public class Pyramide4 extends Figure{
	
	public Pyramide4 (double length, double width, double height) {
		super ();
		this.length = length;
		this.width = width;
		this.height = height;
		
		floorCalculation = new FloorCalculationSquare();
		surfaceCalculation = new SurfaceCalculationPyramide4();
		volumeCalculation = new VolumeCalculationPyramide4();
	}

}

