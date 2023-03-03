package edu.umn.foo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.IsTriangleDemoTest;

public class DemoTest {
  
  public static void test_is_triangle_1() {
		assertFalse(IsTriangleDemoTest.Triangle(0.5,1,0.5));
	}

	public static void test_is_triangle_2() {
		assertFalse(IsTriangleDemoTest.Triangle(0.5,0.5,1));
	}
	
	public static void test_is_triangle_3() {
		assertFalse(IsTriangleDemoTest.Triangle(1,0.5,0.5));
	}
	
	public static void test_is_triangle_4() {
		assertFalse(IsTriangleDemoTest.Triangle(10,4,2));
	}
	
	public static void test_is_triangle_1() {
		assertTrue(IsTriangleDemoTest.Triangle(3,4,5));
	}
	
	public static void test_is_triangle_2() {
		assertTrue(IsTriangleDemoTest.Triangle(5,12,13));
	}
	
	public static void test_is_triangle_3() {
		assertTrue(IsTriangleDemoTest.Triangle(5,13,12));
	}
	
	public static void test_is_triangle_4() {
		assertTrue(IsTriangleDemoTest.Triangle(12,5,13));
	}
	
	public static void test_is_triangle_5() {
		assertTrue(IsTriangleDemoTest.Triangle(12,13,5));
	}
	
	public static void test_is_NOT_triangle_1() {
		assertFalse(IsTriangleDemoTest.Triangle(5,7,13));
	}
	
	public static void test_is_NOT_triangle_2() {
		assertFalse(IsTriangleDemoTest.Triangle(5,13,7));
	}
	
	public static void test_is_NOT_triangle_3() {
		assertFalse(IsTriangleDemoTest.Triangle(13,5,7));
	}
	
	public static void test_is_NOT_triangle_4() {
		assertFalse(IsTriangleDemoTest.Triangle(13,7,5));
	}
	
	public static void test_is_NOT_triangle_5() {
		assertFalse(IsTriangleDemoTest.Triangle(13,7,5));
	}
	
	public static void test_is_NOT_triangle_6() {
		assertFalse(IsTriangleDemoTest.Triangle(5,9,3));
	}
	
	public static void test_is_NOT_triangle_7() {
		assertFalse(IsTriangleDemoTest.Triangle(1,2,-1));
	}
	
	public static void test_main_program_1(){
		ByteArrayInputStream in =
				new ByteArrayInputStream("5\n12\n13\n".getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String consoleOutput = "Enter side 1: +\n";
	    consoleOutput += "Enter side 2: +\n";
		consoleOutput += "Enter side 3: +\n";
		consoleOutput += "This is a triangle.\n";
		
		assertEquals(consoleOutput, out.toString());
		
	}
  
}
