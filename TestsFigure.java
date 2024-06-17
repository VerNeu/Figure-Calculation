package FigureFamily;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestsFigure {

	@Test
	void testRoundFloorResult() throws Exception {
		Figure figure = new Dice(4);
		figure.floorResult = 40.1998;
		figure.roundFloorResult();
		
		assertEquals(40.19, figure.floorResult,0.01);
	}
	
	@Test
	void testRoundSurfaceResult() throws Exception {
		Figure figure = new Pyramide4(1,1,1);
		figure.surfaceResult = 75.5647;
		figure.roundSurfaceResult();
		
		assertEquals(75.56, figure.surfaceResult,0.01);	
	}
	
	@Test
	void testRoundVolumeResult() throws Exception {
		Figure figure = new Globe(5);
		figure.volumeResult = 98.54839;
		figure.roundVolumeResult();
		
		assertEquals(98.54, figure.volumeResult,0.01);
	}

	@Test
	void testGiveFloorResult() throws Exception {
		Figure figure = new Globe (7.4736); 
		figure.giveFloorResult(figure.radius, figure.pi);
		
		assertEquals(46.95,figure.floorResult, 0.01);
	}
	
	@Test
	void testGiveSurfaceResult() throws Exception {
		Figure figure = new Pyramide4 (4.56, 3.2344, 20.56);
		figure.giveSurfaceResult(figure.length, figure.width, figure.height);
		
		assertEquals(175.69,figure.surfaceResult, 0.01);
	}
	
	@Test
	void testGiveVolumeResult() throws Exception {
		Figure figure = new Dice(5.789);
		figure.giveVolumeResult(figure.length, figure.width, figure.height);
		
		assertEquals(194.00, figure.volumeResult, 0.01);
	}

	@Test
	void testGiveAllResults() throws Exception {
		Figure figure = new Cuboid (4.675, 3.4, 8.5432);
		figure.giveAllResults(figure.length, figure.width, figure.height);
		
		assertEquals(15.89,figure.floorResult,0.01);
		assertEquals(169.76,figure.surfaceResult,0.01);
		assertEquals(135.79,figure.volumeResult,0.01);
		
	}
}

