/**
 * 
 */
package odesk.assignment.test;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import odesk.assignment.Rotator;

import org.junit.Test;

/**
 * Test class for {@link Rotator}
 * 
 * @author Abdurrahman A. Nasr
 * 
 */
public class RotatorTest{

	/**
	 * Test method for {@link odesk.assignment.Rotator#rotate(java.lang.Integer[], int)}.<br/>
	 * Test is done on 3 rotation indices (1,2 and 3)
	 */
	@Test
	public void testRotate() {
		Integer[] data = { 1, 2, 3, 4, 5, 6 };
		Integer[] expected1 = { 6, 1, 2, 3, 4, 5 };
		Integer[] expected2 = { 5, 6, 1, 2, 3, 4 };
		Integer[] expected3 = { 4, 5, 6, 1, 2, 3 };

		System.out.println("Original data: "+Arrays.toString(data));
		
		// test rotation by 1
		Integer[] clonedData = data.clone();
		Rotator.rotate(clonedData, 1);
		assertArrayEquals(expected1, clonedData);
		System.out.print("Rotation by 1: ");
		Rotator.printArray(clonedData);
		// test rotation by 2
		clonedData = data.clone();
		Rotator.rotate(clonedData, 2);
		assertArrayEquals(expected2, clonedData);
		System.out.print("Rotation by 2: ");
		Rotator.printArray(clonedData);
		// test rotation by 3
		clonedData = data.clone();
		Rotator.rotate(clonedData, 3);
		assertArrayEquals(expected3, clonedData);
		System.out.print("Rotation by 3: ");
		Rotator.printArray(clonedData);
	}

}
