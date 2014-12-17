package odesk.assignment;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class for running and testing the {@link Rotator} utility
 * 
 * @author Abdurrahman A. Nasr
 * 
 */
public class RotatorExecution {

	/**
	 * JVM entry point
	 * 
	 * @param args
	 *            : the command line arguments, which should be single argument in the form
	 *            1,2,3,4,5,6
	 */
	public static void main(String[] args) {
		if (args == null || args.length != 2) {
			System.out.println("Usage: java -jar ArrayRotator.jar COMMA_SEPARATED_INTEGERS INDEX");
			System.out.println("For example: java -jar ArrayRotator.jar 10,2,13,4,5 3");
			System.exit(1);
		}
		String arg = args[0];
		int index = Integer.parseInt(args[1]);
		String[] data = arg.split(",");
		List<Integer> temp = new ArrayList<Integer>();
		for (String num : data) {
			temp.add(Integer.parseInt(num));
		}
		Integer[] array = new Integer[temp.size()];
		temp.toArray(array);
		Rotator.printArray(array);
		Rotator.rotate(array, index);
		Rotator.printArray(array);

	}

	@SuppressWarnings("unused")
	private static void testRotation() {
		// some test data, as assignment
		Integer[] data = { 1, 2, 3, 4, 5, 6 };
		Rotator.rotate(data, 2);
		Rotator.printArray(data);
	}

}
