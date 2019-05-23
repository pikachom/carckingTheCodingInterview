package chap1;
//////////°³ºıÃÄ¼­¸øÇÏ°ÙÀ½ ¤µ¤¡
public class Question7 {
	public boolean isRotatable(int[][] matrix) {
		if (matrix.length == matrix[0].length) {
			return true;			
		}
		return false;
	}
	public int[][] rotator(int[][] matrix){
		int len = matrix.length;
		int lastIdx = len-1;
		
		
		 for (int i = 0; i < len / 2; i++) {
		        for (int j = 0; j < lastIdx - 2 * i; j++) {
		            int tmp = matrix[j + i][lastIdx - i];
		            matrix[j + i][lastIdx - i] = matrix[i][j + i];
		            matrix[i][j + i] = matrix[lastIdx - j - i][i];
		            matrix[lastIdx - j - i][i] = matrix[lastIdx - i][lastIdx - j - i];
		            matrix[lastIdx - i][lastIdx - j - i] = tmp;
		        }
		    }
		 return matrix;
		}
	        

	public void printMatrix(int[][] matrix) {
		int n = matrix[0].length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j] + "\t");
				
			}
			System.out.println("\n");
		}
	}
	public static void main(String[] args) {
		int[][] matrix = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		Question7 test = new Question7();
		
		test.printMatrix(matrix);
		System.out.println("====================");
		test.printMatrix(test.rotator(matrix));
	}
}
