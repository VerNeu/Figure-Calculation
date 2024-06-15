package FigureFamily;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestsFigure {

	@Test
	void testRoundFloorResult() {
		Figure figure = new Dice(4);
		figure.floorResult = 40.1998;
		figure.roundFloorResult();
		
		assertEquals(40.19, figure.floorResult);
	}
	
	@Test
	void testRoundSurfaceResult() {
		Figure figure = new Pyramide4(1,1,1);
		figure.surfaceResult = 75.5647;
		figure.roundSurfaceResult();
		
		assertEquals(75.56, figure.surfaceResult);	
	}
	
	@Test
	void testRoundVolumeResult() {
		Figure figure = new Globe(5);
		figure.volumeResult = 98.54839;
		figure.roundVolumeResult();
		
		assertEquals(98.54, figure.volumeResult);
	}

	@Test
	void testGiveFloorResult() {
		Figure figure = new Globe (7.4736); 
		figure.giveFloorResult(figure.radius, figure.pi);
		
		assertEquals(46.95,figure.floorResult, 0.01);
	}
	
	@Test
	void testGiveSurfaceResult() {
		Figure figure = new Pyramide4 (4.56, 3.2344, 20.56);
		figure.giveSurfaceResult(figure.length, figure.width, figure.height);
		
		assertEquals(175.69,figure.surfaceResult, 0.01);
	}
	
	@Test
	void testGiveVolumeResult() {
		Figure figure = new Dice(5.789);
		figure.giveVolumeResult(figure.length, figure.width, figure.height);
		
		assertEquals(194.00, figure.volumeResult, 0.01);
	}

}

