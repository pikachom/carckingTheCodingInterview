package chap1;
//////////개빡쳐서못하겟음 ㅅㄱ
public class Question7 {
	public boolean isRotatable(int[][] matrix) {
		if (matrix.length == matrix[0].length) {
			return true;			
		}
		return false;
	}
	public int[][] rotator(int[][] matrix){
		int n = matrix[0].length; // n=4
		int[] tmp = new int[n-1];
		int[] top = new int[n-1];
		int[] right = new int[n-1];
		int[] bottom = new int[n-1];
		int[] left = new int[n-1]; // 더 나은 방법이 있나??
				
		for(int i=0;i<n-1;i++) { // 각 껍데기 값을 집어넣음
			top[i] = matrix[0][i];
			bottom[i] = matrix[n-1][n-1-i];
			right[i] = matrix[i][n-1];
			left[i] = matrix[n-1-i][0];			
		}
		tmp = right;
		right = top;
		top = left;
		left = bottom;
		bottom = tmp; 
		
		for(int i=0;i<n-1;i++) { // 각 껍데기 값을 집어넣음
			matrix[0][i] = top[i];
			matrix[n-1][n-1-i] = bottom[i];
			matrix[i][n-1] = right[i];
			matrix[n-1-i][0] = left[i];			
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
		System.out.println(test.isRotatable(matrix));
		System.out.println(test.rotator(matrix));
		test.printMatrix(test.rotator(matrix));
	}
}
