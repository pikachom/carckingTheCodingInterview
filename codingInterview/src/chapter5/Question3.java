package chapter5;

public class Question3 {
	public int flipBit(int num) {
		// a >>>=1 하면 모두 오른쪽으로 한칸씩 쉬프트됨
		// a & 1 하면 1의자리가 출력됨
		int currentLength = 0;
		int previousLength = 0;
		int maxLength = 1;
		while(num!=0) {
			if((num&1)==1) {
				currentLength++;
			}else if((num&1)==0) {
				if((num&2)==0) {
					previousLength=0;
				}else {
					previousLength=currentLength;
				}				
			}
			maxLength = Math.max(previousLength+currentLength+1, maxLength);
			num>>>=1;
		}
		return maxLength;		
	}
	
	
	
	public static void main(String[] args) {
		int a = 4;
		System.out.println(a&1);
		System.out.println(a = a>>1);
		System.out.println(a >>>=1);
	}
}
