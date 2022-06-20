package telran.numbers;

public class IntegerPrimitives {

	public static byte getMaxByte() {
		byte res = 1;
		while(res > 0) {
			res = (byte)(res* 2);
		}
		return (byte)(res - 1);
	}

	public static byte getMinByte() {
		
		return (byte)(getMaxByte() + 1);
	}

	public static char getMaxChar() {
		char res = 1;
		while (res > 0) {
			res = (char)  (res * 2);
		}
		return (char) (res - 1);
	}

	public static char getMinChar() {
		
		return (char)(getMaxChar() + 1);
	}
	public static short getMaxShort() {
		short res = 1;
		while (res > 0) {
			res = (short) (res * 2);
		}
		return (short) (res - 1);
	}

	public static short getMinShort() {
		
		return (short)(getMaxShort() + 1);
	}

	public static int getMaxInt() {
		int res = 1;
		while(res > 0) {
			res = (int) (res * 2);
		}
		return (int)(res - 1);
	}

	public static int getMinInt() {
		
		return (int)(getMaxInt() + 1);
	}

	public static long getMaxLong() {
		long res = 1;
		while (res > 0) {
			res = res * 2;
		}
		return res - 1;
	}

	public static long getMinLong() {
		
		return (long)(getMaxLong() + 1);
	}

	
	public static int getLengthShort() {
		return getLength(getMaxShort());
	}
	
//	public static int getLengthLong() {
//		int res = 0;
//		long MaxLong =  getMaxLong();
//		while( MaxLong > 0) {
//			MaxLong = MaxLong / 10;
//			res ++;
//			
//		}
//		
//		return res;
//		
//	}
	
	
	public static int getLengthByte() {
		return getLength(getMaxByte());
	}
	

//	public static int getLengthByte() {
//		int res = 0;
//		byte Byte = getMaxByte();
//		res = (int) (Byte / 8);
//		
//		return res;
//	}
//	public static int getLengthChar() {
//		int res = 0;
//		int MaxChar =  getMaxChar();
//		while( MaxChar > 0) {
//			MaxChar = MaxChar / 10;
//			res ++;
//			
//		}
//		
//		return res;
	public static int getLengthChar() {
		return getLength(getMaxChar());
	}
		
//	}
//	public static int getLengthInt(int Int) {
//		
//		String str = Integer.toString(Int);
//		int res = str.length() ;
//
//		
//		return res;
//	}
	
	public static int getLengthInt() {
		return getLength(getMaxInt());
	}
	
	
//	public static int getLengthInt() {
//	
//		int length = (int)Math.log10(getMaxInt()) + 1;
//
//	
//	return length;
//}

	public static int getLengthLong() {
		return  getLength(getMaxLong());
	}

	
	private static int getLength(long x) {

		int length = (int) ((Math.log(x) + 1) / Math.log(2));
		return length / 8;

		
	}
	
}


