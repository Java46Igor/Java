package telran.text.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringsStandartTests {

	@Test
	void stringArraysTest() {
		String strEnglish = "hello";
		String strHebrew = "שלום";
		char arCh[] = {'h', 'e', 'l', 'l', 'o'};
		byte arBytes[] = {'h', 'e', 'l', 'l', 'o'};
		assertArrayEquals(arCh, strEnglish.toCharArray());
		assertArrayEquals(arBytes, strEnglish.getBytes());
		assertEquals(5, strEnglish.getBytes().length);
		assertEquals(4, strHebrew.toCharArray().length);
		assertEquals(8, strHebrew.getBytes().length);
		
		
	}
	
	@Test
	void equalsString() {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		assertTrue(str1 == str2);
		assertFalse(str1 == str3);
		assertTrue(str1.equals(str3));  // поверка посимвольно, содержимое
		assertEquals(str1,str3);  // поверка посимвольно, содержимое
	}
	
	@Test
	void comparingStrings() {
		String str1 = "123456789";
		String str2 = "ab";
		String str3 = "AB";
		String str4 = "aB";
		assertTrue(str1.compareTo(str2) < 0);// 0 если равны, > 0 str1 > str2, < 0 str1 < str2 
		assertTrue(str2.compareTo(str3) > 0);	
		assertEquals('1' - 'a', str1.compareTo(str2));
		assertTrue(str4.compareTo(str3) > 0); //in ASCII small letter bigger then big letter
		assertEquals(0, str2.compareToIgnoreCase(str4));
		assertEquals(0,str2.compareTo(str4.toLowerCase()));
		
		}
	@Test
	void indexOfTests() {
		String str = "Hello";
		assertEquals(2, str.indexOf('l'));
		assertEquals(3,str.lastIndexOf('l'));
		assertEquals(-1, str.indexOf('w'));
		
	}
	@Test
	void formatTest() {
		String strExpected = "a=5";
		int b = 10;
		assertEquals(strExpected, String.format("a=%d", b / 2));
		
	}
	
	// class String 

}
