package test;




/*import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;*/
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import srcf.calculater;

class testcalculater {

	/*@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}*/

	
	@Test
	void testSum_BothNumbersAreNegative_ShouldReturnNegativeValue() {
		calculater obj = new calculater();
		int f ; 
		f = obj.addTheFollowingNumberToOne(-2,-4);
		assertTrue(f==-6);
		//fail("Not yet implemented");
	}
	
	@Test
	void  testSum_BothNumbersArePositive_ShouldReturnPositiveValue() {
		
		calculater obj = new calculater();
		int x ; 
		x = obj.addTheFollowingNumberToOne(2,4);
		assertTrue(x==6);
		
	}
	
	@Test 
	void testMul_BothNumbersArePositive_ShouldReturnPositiveValue() {
		calculater obj = new calculater();
		double x ; 
		x = obj.mulTheFollowingNumberToOne(2,4);
		assertTrue(x==8);
	}
	
	/*@Test (g =  ArithmeticException.class)
	void testDiv_TwoNumber_shouldReturnAvalue() {
		calculater obj = new calculater();
		double g ; 
		g = obj.divTheFollowingNumberToOne(2,0);
	}*/

}
