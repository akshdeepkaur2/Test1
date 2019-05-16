//Akshdeep kaur
//student id - C0738118
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SnakeTest {

	private Snake peter;
	private Snake takis;
	private Snake favouriteFood;
	
	@Before
	public void setUp() throws Exception {
		peter = new Snake("Peter S", 10, "coffee");
		takis = new Snake("Takis Z", 80, "vegetables");
	}

	@Test
	public void Healthytest() {
		this.favouriteFood = favouriteFood;
Snake vegetables = null;
if(favouriteFood == vegetables){
	
		System.out.println( "snake is healthy");	
		}
else {
	System.out.println("snake is unhealthy");
}
	}
	

	@Test
	public void FitInCage(int SnakeLength) {
		int cageLength = 70;
		if (cageLength<SnakeLength);
		System.out.println("Snake is smaller then cage");
		
		if(cageLength>SnakeLength);
		System.out.println("Snake is bigger than cage");
	}
	
}