package chapter5;

public class Bit {
	public boolean getBit(int num, int i) {
		return ((num&(1<<i))!=0);
		// num�� i ��° �ڸ��� 0���� 1���� ã�Ƴ��� �Լ� 
	}
	public int setBit(int num, int i) {
		return num | (1<<i);
	}
	public int clearBit(int num, int i) {
		return (num & (~(1<<i)));
	}
	public int clearBitsMSthroughI(int num, int i) {
		int mask = (1<<i) - 1;
		return num & mask;
	}
	
}
