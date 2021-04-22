package org.howard.edu.lsp.assignment7.junit;

import static org.junit.Assert.assertEquals;

import org.howard.edu.lsp.assignment7.tollbooth.AustinTollBooth;
import org.howard.edu.lsp.assignment7.tollbooth.FordTruck;
import org.howard.edu.lsp.assignment7.tollbooth.RamTruck;
import org.howard.edu.lsp.assignment7.tollbooth.TollBooth;
import org.howard.edu.lsp.assignment7.tollbooth.Truck;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class TollBoothTest {
	TollBooth booth = new AustinTollBooth();
	Truck ford = new FordTruck(5, 12000); 	// 5 axles and 12000 kilograms
	Truck ram = new RamTruck(2, 5000); 	// 2 axles and 5000kg
	
	//@Rule
    //public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Before
	public void setUp() throws Exception {
		booth = new AustinTollBooth();
		ford = new FordTruck(5, 12000);
		ram = new RamTruck(2, 5000);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Tests for Calculate Toll method in Toll Booth")
	public void testCalculateToll() {
		booth.calculateToll(ford);
		booth.calculateToll(ram);
	}
	
	@Test
	@DisplayName("Tests for Reset method in Toll Booth")
	public void testReset() {
		booth.calculateToll(ford);
		booth.reset();
	}
	
	@Test
	@DisplayName("Tests for Display Data method in Toll Booth")
	public void testDisplayData() {
		booth.displayData();
	}
	
	@Test
	@DisplayName("Tests for Get Axels method in Truck")
	public void testGetAxles() {
		Integer fordAxle = 5;
		Integer ramAxle = 2;
		
		assertEquals(fordAxle, ford.getAxles());
		assertEquals(ramAxle, ram.getAxles());
	}
	
	@Test
	@DisplayName("Tests for Get Total Weight method in Truck")
	public void testGetTotalWeight() {
		Integer fordWeight = 12000;
		Integer ramWeight = 5000;
		
		assertEquals(fordWeight, ford.getTotalWeight());
		assertEquals(ramWeight, ram.getTotalWeight());
	}
}
