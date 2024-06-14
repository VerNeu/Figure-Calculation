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
	
	protected double floorResult;
	protected double surfaceResult;
	protected double volumeResult;
	
	protected FloorCalculation floorCalculation;
	protected SurfaceCalculation surfaceCalculation;
	protected VolumeCalculation volumeCalculation;
	
	public Figure() {}
	
	public void roundFloorResult () {
		double scale = Math.pow(10, 2);
		floorResult = Math.floor(floorResult * scale) / scale;
	}
	
	public void roundSurfaceResult () {
		double scale = Math.pow(10, 2);
		surfaceResult = Math.floor(surfaceResult * scale) / scale;
	}
	
	public void roundVolumeResult () {
		double scale = Math.pow(10, 2);
		volumeResult = Math.floor(volumeResult * scale) / scale;
	}

	public void giveFloorResult(double length_radius, double width_pi) {
		floorResult = floorCalculation.calculateFloor(length_radius, width_pi);
		roundFloorResult ();
		System.out.println(floorResult);
	}
	
	public void giveSurfaceResult(double length_radius, double width_pi, double height_dummy) {
		surfaceResult = surfaceCalculation.calculateSurface(length_radius, width_pi, height_dummy);
		roundSurfaceResult ();
		System.out.println(surfaceResult);	
	}
	
	public void giveVolumeResult(double length_radius, double width_pi, double height_dummy) {
		volumeResult = volumeCalculation.calculateVolume(length_radius, width_pi, height_dummy);
		roundVolumeResult ();
		System.out.println(volumeResult);		
	}
	
	public void giveAllResults(double length_radius, double width_pi, double height_dummy) {
		
		floorResult = floorCalculation.calculateFloor(length_radius, width_pi);
		roundFloorResult ();
		surfaceResult = surfaceCalculation.calculateSurface(length_radius, width_pi, height_dummy);
		roundSurfaceResult ();
		volumeResult = volumeCalculation.calculateVolume(length_radius, width_pi, height_dummy);
		roundVolumeResult ();
		System.out.println(floorResult);
		System.out.println(surfaceResult);
		System.out.println(volumeResult);
	}
	
}
