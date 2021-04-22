package org.howard.edu.lsp.assignment7.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.howard.edu.lsp.assignment7.tollbooth.AustinTollBooth;
import org.howard.edu.lsp.assignment7.tollbooth.FordTruck;
import org.howard.edu.lsp.assignment7.tollbooth.RamTruck;
import org.howard.edu.lsp.assignment7.tollbooth.TollBooth;
import org.howard.edu.lsp.assignment7.tollbooth.Truck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class TollBoothTest {
	TollBooth booth = new AustinTollBooth();
	Truck ford = new FordTruck(5, 12000); 	// 5 axles and 12000 kilograms
	Truck ram = new RamTruck(2, 5000); 	// 2 axles and 5000kg
	
	// For evaluating the print statements
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	@Before
	public void setUp() throws Exception {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(standardOut);
	}

	@Test
	@DisplayName("Tests for Calculate Toll method in Toll Booth for Ford Truck")
	public void testCalculateTollFord() {
		booth.calculateToll(ford);
		assertTrue(outputStreamCaptor.toString().trim().contains("Truck arrival - Axles: 5 Total weight: 12000 Toll due: 265"));
		}
	
	@Test
	@DisplayName("Tests for Calculate Toll method in Toll Booth for Ram Truck")
	public void testCalculateTollRam() {
		booth.calculateToll(ram);
		assertTrue(outputStreamCaptor.toString().trim().contains("Truck arrival - Axles: 2 Total weight: 5000 Toll due: 110"));
		}
	
	@Test
	@DisplayName("Tests for Display Data method in Toll Booth")
	public void testDisplayData() {
		booth.calculateToll(ram);
		booth.calculateToll(ford);
		booth.displayData();
		assertTrue(outputStreamCaptor.toString().contains("*** Collecting receipts  ***\r\n"
				+ "Totals since the last collection - Receipts: 375 Trucks: 2\r\n"));
	}
	
	@Test
	@DisplayName("Tests for Reset method in Toll Booth")
	public void testReset() {
		booth.reset();
		booth.displayData();
		assertTrue(outputStreamCaptor.toString().contains("*** Collecting receipts  ***\r\n"
				+ "Totals since the last collection - Receipts: 0 Trucks: 0\r\n"));
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
