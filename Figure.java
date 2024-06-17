package FigureFamily;

import java.lang.Math;
import algoFamilyFloorCalculation.FloorCalculation;
import algoFamilySurfaceCalculation.SurfaceCalculation;
import algoFamilyVolumeCalculation.VolumeCalculation;

public abstract class Figure {
	
	protected double length;
	protected double width;
	protected double height;
	protected double radius;
	protected double pi = Math.PI;
	protected double dummy = 1;
	protected double roundingScale = Math.pow(10, 2);
	
	protected double floorResult;
	protected double surfaceResult;
	protected double volumeResult;
	
	protected FloorCalculation floorCalculation;
	protected SurfaceCalculation surfaceCalculation;
	protected VolumeCalculation volumeCalculation;
	
	public Figure() {}
	
	public void roundFloorResult () {
		floorResult = Math.floor(floorResult * roundingScale) / roundingScale;
	}
	
	public void roundSurfaceResult () {
		surfaceResult = Math.floor(surfaceResult * roundingScale) / roundingScale;
	}
	
	public void roundVolumeResult () {
		volumeResult = Math.floor(volumeResult * roundingScale) / roundingScale;
	}

	public void giveFloorResult(double length_radius, double width_pi) {
		floorResult = floorCalculation.calculateFloor(length_radius, width_pi);
		roundFloorResult ();
	}
	
	public void giveSurfaceResult(double length_radius, double width_pi, double height_dummy) {
		surfaceResult = surfaceCalculation.calculateSurface(length_radius, width_pi, height_dummy);
		roundSurfaceResult ();
	}
	
	public void giveVolumeResult(double length_radius, double width_pi, double height_dummy) {
		volumeResult = volumeCalculation.calculateVolume(length_radius, width_pi, height_dummy);
		roundVolumeResult ();		
	}
	
	public void giveAllResults(double length_radius, double width_pi, double height_dummy) {
		giveFloorResult(length_radius, width_pi);
		giveSurfaceResult(length_radius, width_pi, height_dummy);
		giveVolumeResult(length_radius, width_pi, height_dummy);
		
		/*System.out.println(floorResult);
		System.out.println(surfaceResult);
		System.out.println(volumeResult);*/
	}
}
