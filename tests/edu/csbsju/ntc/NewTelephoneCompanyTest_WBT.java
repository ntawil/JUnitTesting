package edu.csbsju.ntc;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * 
 * @author ntawil001
 * @version 4/2/18
 *
 */
public class NewTelephoneCompanyTest_WBT {
	private NewTelephoneCompany ntc;
	
	@Before
	public void setUp() throws Exception {
		ntc = new NewTelephoneCompany();
	}
	

//
//	@Test
//	public void testGetDuration() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetDuration() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testComputeCharge() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMain() {
//		fail("Not yet implemented");
//	}
		@Test (expected = UnsupportedOperationException.class)
		public void testInvalidStartTime1() 
		{
			ntc.setStartTime(-5);
			ntc.setDuration(10);
			ntc.computeCharge();
		}
		
		/**
		 * Test method with input -1,10
		 */
		@Test (expected = UnsupportedOperationException.class)
		public void testInvalidStartTime2() 
		{
			ntc.setStartTime(-1);
			ntc.setDuration(10);
			ntc.computeCharge();
		}
		
		/**
		 * Test method with input 2544,10
		 */
		@Test (expected = UnsupportedOperationException.class)
		public void testInvalidStartTime3() 
		{
			ntc.setStartTime(2544);
			ntc.setDuration(10);
			ntc.computeCharge();
		}
		
		/**
		 * Test method with input 2400,10
		 */
		@Test (expected = UnsupportedOperationException.class)
		public void testInvalidStartTime4() 
		{
			ntc.setStartTime(2400);
			ntc.setDuration(10);
			ntc.computeCharge();
		}
		
		/**
		 * Test method with input 2401,10
		 */
		@Test (expected = UnsupportedOperationException.class)
		public void testInvalidStartTime5() {
			ntc.setStartTime(2401);
			ntc.setDuration(10);
			ntc.computeCharge();
		}
		
		/**
		 * Test method with input 1578,10
		 */
		@Test (expected = UnsupportedOperationException.class)
		public void testInvalidStartTime6() 
		{
			ntc.setStartTime(1578);
			ntc.setDuration(10);
			ntc.computeCharge();
		}
		
		/**
		 * Test method with input 1160,10
		 */
		@Test (expected = UnsupportedOperationException.class)
		public void testInvalidStartTime7() 
		{
			ntc.setStartTime(1160);
			ntc.setDuration(10);
			ntc.computeCharge();
		}
		
		/**
		 * Test method with input 1161,10
		 */
		@Test (expected = UnsupportedOperationException.class)
		public void testInvalidStartTime8() 
		{
			ntc.setStartTime(1161);
			ntc.setDuration(10);
			ntc.computeCharge();
		}
		
		/**
		 * Test method with input 799,-5
		 */
		@Test (expected = UnsupportedOperationException.class)
		public void testInvalidStartTime9() 
		{
			ntc.setStartTime(799);
			ntc.setDuration(-5);
			ntc.computeCharge();
		}
		
		/**
		 * Test method with input 1800,0
		 */
		@Test (expected = UnsupportedOperationException.class)
		public void testInvalidDuration1() 
		{
			ntc.setStartTime(1800);
			ntc.setDuration(0);
			ntc.computeCharge();
		}
		
		/**
		 * Test method with input, 1801,-1
		 */
		@Test (expected = UnsupportedOperationException.class)
		public void testInvalidDuration2() 
		{
			ntc.setStartTime(1801);
			ntc.setDuration(-1);
			ntc.computeCharge();
		}
		
		/**
		 * Test method with input 500,100
		 */
		@Test
		public void testComputeCharge_DiscountedStartTimeAndDiscountedDuration1() 
		{
			ntc.setStartTime(500);
			ntc.setDuration(100);
			Assert.assertTrue("Charge is 1768.0: ", ntc.computeCharge() == 1768.0);
		}
		
		/**
		 * Test method with input 759,61
		 */
		@Test
		public void testComputeCharge_DiscountedStartTimeAndDiscountedDuration2() 
		{
			ntc.setStartTime(759);
			ntc.setDuration(61);
			Assert.assertTrue("Charge is: 1078.48: ", ntc.computeCharge() == 1078.48);
		}
		
		/**
		 * Test method with input 1959,61
		 */
		@Test
		public void testComputeCharge_DiscountedStartTimeAndDiscountedDuration3() 
		{
			ntc.setStartTime(1959);
			ntc.setDuration(61);
			Assert.assertTrue("Charge is 1078.48: ", ntc.computeCharge() == 1078.48);
		}
		
		/**
		 * Test method with input 2359,65
		 */
		@Test
		public void testComputeCharge_DiscountedStartTimeAndDiscountedDuration4() 
		{
			ntc.setStartTime(2359);
			ntc.setDuration(65);
			Assert.assertTrue("Charge is 1149.2: ", ntc.computeCharge() == 1149.2);
		}
		
		/**
		 * Test method with input 0,60
		 */
		@Test
		public void testComputeCharge_DiscountedStartTime1() 
		{
			ntc.setStartTime(0);
			ntc.setDuration(60);
			Assert.assertTrue("Charge is 1248.0: ", ntc.computeCharge() == 1248.0);
		}
		
		/**
		 * Test method with input 400,59
		 */
		@Test
		public void testComputeCharge_DiscountedStartTime2() 
		{
			ntc.setStartTime(400);
			ntc.setDuration(59);
			Assert.assertTrue("Charge is 1227.2: ", ntc.computeCharge() == 1227.2);
		}
		
		/**
		 * Test method with input 759,1
		 */
		@Test
		public void testComputeCharge_DiscountedStartTime3() 
		{
			ntc.setStartTime(759);
			ntc.setDuration(1);
			Assert.assertTrue("Charge is 20.8: ", ntc.computeCharge() == 20.8);
		}
		
		/**
		 * Test method with input 1800,10
		 */
		@Test
		public void testComputeCharge_DiscountedStartTime4() 
		{
			ntc.setStartTime(1800);
			ntc.setDuration(10);
			Assert.assertTrue("Charge is 208.0: ", ntc.computeCharge() == 208.0);
		}
		
		/**
		 * Test method with input 1801,10
		 */
		@Test
		public void testComputeCharge_DiscountedStartTime5() 
		{
			ntc.setStartTime(1801);
			ntc.setDuration(10);
			Assert.assertTrue("Charge is 208.0: ", ntc.computeCharge() == 208.0);
		}
		
		/**
		 * Test method with input 2359,10
		 */
		@Test
		public void testComputeCharge_DiscountedStartTime6() 
		{
			ntc.setStartTime(2359);
			ntc.setDuration(10);
			Assert.assertTrue("Charge is 208.0: ", ntc.computeCharge() == 208.0);
		}
		
		/**
		 * Test method with input 800,65
		 */
		@Test
		public void testComputeCharge_DiscountedDuration1() 
		{
			ntc.setStartTime(800);
			ntc.setDuration(65);
			Assert.assertTrue("Charge is 2298.4: ", ntc.computeCharge() == 2298.4);
		}
		
		/**
		 * Test method with input 900,61
		 */
		@Test
		public void testComputeCharge_DiscountedDuration2() 
		{
			ntc.setStartTime(900);
			ntc.setDuration(61);
			Assert.assertTrue("Charge is 2156.96: ", ntc.computeCharge() == 2156.96);
		}
		
		/**
		 * Test method with input 1000,40
		 */
		@Test
		public void testComputeCharge_NoDiscount1() 
		{
			ntc.setStartTime(1000);
			ntc.setDuration(40);
			Assert.assertTrue("Charge is 1664.0: ", ntc.computeCharge() == 1664.0);
		}
		
		/**
		 * Test method with input 800,1
		 */
		@Test
		public void testComputeCharge_NoDiscount2() 
		{
			ntc.setStartTime(800);
			ntc.setDuration(1);
			Assert.assertTrue("Charge is 41.6: ", ntc.computeCharge() == 41.6);
		}
		
		/**
		 * Test method for with input 801,59
		 */
		@Test
		public void testComputeCharge_NoDiscount3() 
		{
			ntc.setStartTime(801);
			ntc.setDuration(59);
			Assert.assertTrue("Charge is 2454.4: ", ntc.computeCharge() == 2454.4);
		}
		
		/**
		 * Test method with input 1759,60
		 */
		@Test
		public void testComputeCharge_NoDiscount4() {
			ntc.setStartTime(1759);
			ntc.setDuration(60);
			Assert.assertTrue("Charge is 2496.0: ", ntc.computeCharge() == 2496.0);
		}

		/**
		 * Test main method 
		 */
		@SuppressWarnings("static-access")
		@Test
		public void testMainMethod()
		{
			String args[] = null;
			ntc.main(args);
		}
		
}
