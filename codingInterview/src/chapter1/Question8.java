package chapter1;

public class Question8 {
	public int[][] zeroTest(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					return zeroMaker(matrix, i, j);
				}
			}
		}
		return matrix;
	}

	public int[][] zeroMaker(int[][] matrix, int i, int j) {
		int m = matrix.length;
		int n = matrix[0].length;

		for (int k = 0; k < m; k++) {
			for (int l = 0; l < n; l++) {
				matrix[i][l] = 0;
				matrix[k][j] = 0;

			}

		}
		return matrix;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 0, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		Question8 test = new Question8();
		test.zeroTest(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println("\n");
		}

	}
}
