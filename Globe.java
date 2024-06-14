package FigureFamily;

import algoFamilyFloorCalculation.FloorCalculationCircle;
import algoFamilySurfaceCalculation.SurfaceCalculationGlobe;
import algoFamilyVolumeCalculation.VolumeCalculationGlobe;

public class Globe extends Figure{
	
	public Globe (double radius) {
		super ();	
		this.radius = radius;
		
		floorCalculation = new FloorCalculationCircle();
		surfaceCalculation = new SurfaceCalculationGlobe();
		volumeCalculation = new VolumeCalculationGlobe();
	}

}
