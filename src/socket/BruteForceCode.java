/*
Copyright 2010 kiddy
*/
package socket;

public class BruteForceCode {
	private static final byte byteVal = 101;
	private static final short shortVal = 10001;
	private static final int intVal = 100000001;
	private static final long longVal = 1000000000001L;
	 
	private static final int BSIZE = 1;
	private static final int SSIZE = Short.SIZE/Byte.SIZE;
	private static final int ISIZE = Integer.SIZE/Byte.SIZE;
	private static final int LSIZE = Long.SIZE/Byte.SIZE;
	
	private static final int BYTEMASK = 0xff;
	
	//将字节数组转化为字符串
	public static String byteArraytoDecimalString(byte[] bArray) {
		StringBuilder rtn = new StringBuilder();
		for(byte b : bArray) {
			rtn.append(b & BYTEMASK).append(" ");
		}
		return rtn.toString();
	}
	
	public static int encodeIntBigEndian(byte[] dst, long val, int offset, int size) {
		for(int i=0; i < size; i++) {
			dst[offset++] = (byte)(val >> ((size-i-1)*Byte.SIZE));
		}
		return offset;
	}
	
	public static long decodeIntBigEndian(byte[] val, int offset, int size) {
		long rtn = 0L;
		for(int i=0; i < size; i++) {
			rtn = (rtn << Byte.SIZE) | (long)(val[offset+i] & BYTEMASK);
		}
		return rtn;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] message = new byte[BSIZE+SSIZE+ISIZE+LSIZE];
		int offset = encodeIntBigEndian(message, byteVal, 0, BSIZE);
		offset = encodeIntBigEndian(message, shortVal, offset, SSIZE);
		offset = encodeIntBigEndian(message, intVal, offset, ISIZE);
		offset = encodeIntBigEndian(message, longVal, offset, LSIZE);
		
		String result = byteArraytoDecimalString(message);
		System.out.println(result);
		
		long value = decodeIntBigEndian(message, 0, BSIZE);
		value = decodeIntBigEndian(message, BSIZE, SSIZE);
		System.out.println(value);
	}

}
