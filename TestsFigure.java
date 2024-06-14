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

}

