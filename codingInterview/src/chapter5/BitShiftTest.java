package chapter5;

public class BitShiftTest {
   public static String getBit(int n) {
       int[] array = new int[8];
       int iattr = (int) ((byte) n & 0xFF);
       int bitWise = 1;
       for (int i = 0; i < 8; i++) {
              if ((bitWise & iattr) > 0) array[i] = 1;
              else  array[i] = 0;
        bitWise = (bitWise << 1) & 0xfe;
       }
       StringBuilder sb = new StringBuilder();
       for (int i = 0; i < array.length; ++i) sb.append(array[7 - i]);
       return sb.toString();
   }
   public static void main(String[] args) {
	   int a = 23;
	   System.out.println(getBit(a));
       int b = a << 1;
       System.out.println(getBit(b));
       
   }
}
