//package telran.text.tests;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static telran.text.Strings.*;
//
//import org.junit.jupiter.api.Test;
//
//class StringRegExTests {
//
//	@Test
//	void javaVariableTrue() {
//		
//		assertTrue(isJavaVariable("__"));
//		assertTrue(isJavaVariable("$"));
//		assertTrue(isJavaVariable("$_"));
//		assertTrue(isJavaVariable("abc"));
//		assertTrue(isJavaVariable("abc100"));
//		assertTrue(isJavaVariable("$2"));
//		assertTrue(isJavaVariable("_2"));
//		
//	}
//	private void assertTrue(boolean javaVariable) {
//		// TODO Auto-generated method stub
//		
//	}
//	//@Test
//	void javaVariableFalse() {
//		assertFalse(isJavaVariable("2_"));
//		assertFalse(isJavaVariable("_"));
//		assertFalse(isJavaVariable("a 2"));
//		
//	}
//	private void assertFalse(boolean javaVariable) {
//		// TODO Auto-generated method stub
//		
//	}
//	//@Test
//	void ipV4True() {
//		assertTrue(isIPv4("0.0.0.0"));
//		assertTrue(isIPv4("250.0.199.200"));
//		assertTrue(isIPv4("250.0.199.249"));
//		assertTrue(isIPv4("001.0.2.0"));
//		assertTrue(isIPv4("255.255.255.255"));
//	}
//	//@Test
//	void ipV4False() {
//		assertFalse(isIPv4("0.0.0.0.0"));
//		assertFalse(isIPv4("0.*.10.0"));
//		assertFalse(isIPv4("-10.0.0.0"));
//		assertFalse(isIPv4("100..10.1.1"));
//		assertFalse(isIPv4("100.10.1.256"));
//		assertFalse(isIPv4("a.10.1.1"));
//		
//	}
//
//}

package telran.text.tests;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static telran.text.Strings.*;
import org.junit.jupiter.api.Test;

public class StringRegExTests {
	@Test
	void arithmeticExpressionTrue() {
		assertTrue(isArithmeticExpression("a+b+c"));
		assertTrue(isArithmeticExpression("a+16 * (4-b * 4)/10"));
		assertTrue(isArithmeticExpression("a+2- 5.0 *(3-2+x)/1. 2"));
		assertTrue(isArithmeticExpression("(a+4.2)-(abc4)*2"));
		assertTrue(isArithmeticExpression("x+y-(__*$)+2.1"));
	}
	@Test
	void arithmeticExpressionFalse() {

		assertFalse(isArithmeticExpression("(-x+y+c"));
		assertFalse(isArithmeticExpression("x+y*(c*a"));
		assertFalse(isArithmeticExpression("a/b/(c+d"));
//		assertFalse(isArithmeticExpression("a+b-(a+c)"));

	}
}
