package odesk.assignment;

import java.util.Arrays;
import java.util.Collections;

/**
 * Main class used for rotating some integer array in reverse order by specific index number
 * 
 * @author Abdurrahman A. Nasr
 * 
 */
public class Rotator {

	/**
	 * Rotate an array in reverse at the specified index<br/>
	 * <b>Note: </b> if index > array.length, the method will fall to the remainder of index (e.g.
	 * index % array.length)
	 * 
	 * @param array
	 *            : the array to be rotated. the rotated array will be store here too
	 * @param index
	 *            : the reversed index of rotation
	 */
	public static void rotate(Integer[] array, int index) {

		int length = array.length;
		// show informative message if index is bigger than array length
		if (index > length)
			System.out.println("Index is bigger than array size, falling index to the remainder over length (e.g. index%array.length = )" + index % length);
		// fall back to the remainder
		index = index % length;
		// ========= The main rotation business=====
		Collections.rotate(Arrays.asList(array), index);
		// ==========================================
	}

	/**
	 * Utility method for printing elements within array to the standard out
	 * 
	 * @param array
	 *            : the array to be printed
	 */
	public static void printArray(Integer[] array) {
		System.out.println(Arrays.toString(array));
	}
}
