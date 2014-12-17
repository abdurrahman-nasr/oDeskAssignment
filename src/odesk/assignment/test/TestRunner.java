/**
 * 
 */
package odesk.assignment.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Used for running the test cases
 * 
 * @author Abdurrahman A. Nasr
 * 
 */
public class TestRunner {
	public static void main(String[] args) {
		System.out.println("Running Test cases");
		Result result = JUnitCore.runClasses(RotatorTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful() ? "Success" : "Failure");
	}
}
