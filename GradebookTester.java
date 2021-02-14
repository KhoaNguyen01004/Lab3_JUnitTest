import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	private GradeBook grade1;
	private GradeBook grade2;
	
	@BeforeEach
	void setUp() throws Exception {
		grade1 = new GradeBook(5);
		grade1.addScore(10);
		grade1.addScore(5);
		grade1.addScore(20);
		
		grade2 = new GradeBook(5);
		grade2.addScore(20);
		grade2.addScore(10);
		grade2.addScore(15);
	}

	@AfterEach
	void tearDown() throws Exception {
		grade1 = null;
		grade2 = null;
	}

	@Test
	void testSum() {
//		System.out.println(grade1.toString());
//		System.out.println(grade2.toString());
		assertEquals(35,grade1.sum());
		assertEquals(45,grade2.sum());
	}
	
	@Test
	void testAddScore() {
		assertTrue(grade1.toString().equals("10.0 5.0 20.0 0.0 0.0 "));
		assertTrue(grade2.toString().equals("20.0 10.0 15.0 0.0 0.0 "));
		
	}

	@Test
	void testMinimum() {
		assertEquals(5, grade1.minimum());
		assertEquals(10, grade2.minimum());
		
	}

	@Test
	void testFinalScore() {
		assertEquals(30, grade1.finalScore());
		assertEquals(35, grade2.finalScore());
		
	}

}
