package chapter8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Question2 {
	class Board{
		int columns;
		int rows;
		ArrayList<Bomb> Bombs = new ArrayList<Bomb>();
		
		Board(int columns, int rows){
			this.columns = columns;
			this.rows = rows;
		}
		void addBomb(int bombColumn, int bombRow) {
			if(this.columns<bombColumn || this.rows<bombRow) {
				System.out.println("보드규격 바깥에 bomb을 추가할 수 없습니다.");
				return;
			}
			Bomb newBomb = new Bomb(bombColumn, bombRow);
			this.Bombs.add(newBomb);
			System.out.println(bombColumn + "," + bombRow + "에 폭탄 장착 완료");
		}
		boolean checkBomb(int column, int row) {
			for(Bomb bomb : this.Bombs) {
				if(bomb.column == column && bomb.row == row) {
					return true;
				}				
			}
			return false;
		}
		void printBoard() {
			for(int r=1;r<=this.rows;r++) {
				StringBuilder sb = new StringBuilder();
				for(int c=1;c<=this.columns;c++) {
					if(checkBomb(c,r)) {
						sb.append("X");
					}else {
						sb.append("O");
					}
				}
				System.out.println(sb);
			}
		}
	}
	class Bomb{
		int row;
		int column;
		Bomb(int column, int row){
			this.column = column;
			this.row = row;
		}
	}
	class Point{
		int row;
		int column;
		Point(int column, int row){
			this.column = column;
			this.row = row;
		}
	}
	
	ArrayList<Point> getPath(Board board){
		HashSet<Point> failedPoints = new HashSet<Point>();
		ArrayList<Point> path = new ArrayList<Point>();
		Point goal = new Point(board.columns,board.rows);
		if(getPath(board, failedPoints, path, goal)){
			for(Point point : path) {
				int col = point.column;
				int row = point.row;
				System.out.print("("+col+" "+row+")"+"->");
			}
			return path;
		}
		
		return null;
	}
	boolean getPath(Board board, HashSet<Point> failedPoints, ArrayList<Point> path, Point goal){
		int col = goal.column;
		int row = goal.row;
		if(col<1 || row<1) {
			return false;
		}
		if(col==1 && row == 1) {
			path.add(goal);
			return true;
		}
		if(failedPoints.contains(goal)) {
			return false;
		}
		if(board.checkBomb(col, row)) {
			return false;
		}
		Point goalLeft = new Point(col-1, row);
		Point goalUpper = new Point(col, row-1);
		if(getPath(board, failedPoints, path, goalLeft)||getPath(board, failedPoints, path, goalUpper)) {			
			path.add(goal);
			return true;
		}
		failedPoints.add(goal);
		return false;
	}
	
	
	
	public static void main(String[] args) {
		Question2 test = new Question2();
		Board board = test.new Board(7,7);
		board.addBomb(3, 3);
		board.addBomb(7, 1);
		board.addBomb(11, 4);
		board.addBomb(4, 3);
		board.addBomb(1, 4);
		board.printBoard();
		test.getPath(board);
		
	}
}
