package chapter8;

public class Question10 {
	
	public void paintFill(Color[][] screen, int row, int col, Color color) {
		Color currentColor = screen[row][col];
		paintFill(screen, row, col, color, currentColor);
	}
	
	
	
	private void paintFill(Color[][] screen, int row, int col, Color color, Color currentColor) {
		if(color==currentColor) {
			return;
		}
		if(isOverEdge(screen,row,col)) {
			return;
		}
		if(screen[row][col] == currentColor) {
			screen[row][col] = color;
			paintFill(screen, row+1, col, color, currentColor);
			paintFill(screen, row, col+1, color, currentColor);
			paintFill(screen, row-1, col, color, currentColor);
			paintFill(screen, row, col-1, color, currentColor);
		}
		
	}
	private boolean isOverEdge(Color[][] screen, int row, int col) {
		int height = screen.length;
		int width = screen[0].length;
		if(row>=height||col>=width||row<0||col<0) {
			return true;
		}
		return false;
	}
	public void showScreen(Color[][] screen) {
		for(Color[] line : screen) {
			for(Color pixel : line) {
				System.out.print(pixel);
				
			}
			System.out.println();
		}
		System.out.println("================");
	}
	


	enum Color{
		R, G, B
	}
	
	
	public static void main(String[] args) {
		Question10 test = new Question10();
		Color[][] screen = {{Color.G,Color.G,Color.R},
							{Color.R,Color.G,Color.B},
							{Color.B,Color.G,Color.B},
							{Color.B,Color.G,Color.R}};
		test.showScreen(screen);
		test.paintFill(screen, 0, 2, Color.B);
		test.showScreen(screen);
	}
}
