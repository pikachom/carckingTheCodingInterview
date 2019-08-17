package chapter7;

import chapter7.Game_KH.GameState;

public class Question10 {
 // minesweeper
}
class Cell{
	private int row;
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public boolean isBomb() {
		return isBomb;
	}

	public void setBomb(boolean isBomb) {
		this.isBomb = isBomb;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isExposed() {
		return isExposed;
	}

	public void setExposed(boolean isExposed) {
		this.isExposed = isExposed;
	}

	public boolean isGuess() {
		return isGuess;
	}

	public void setGuess(boolean isGuess) {
		this.isGuess = isGuess;
	}

	private int column;
	private boolean isBomb;
	private int number;
	private boolean isExposed = false;
	private boolean isGuess = false;
	
	public Cell(int r, int c) {
		this.setRow(r);
		this.setColumn(c);
	}
	public boolean flip() {
		isExposed = true;
		return !isBomb;
	}
	public boolean toggleGuess() {
		if(!isExposed) {
			isGuess = !isGuess;
		}
		return isGuess;
	}
	
	
}
class Board{
	private int nRows;
	private int nColumns;
	private int nBombs = 0;
	private Cell[][] cells;
	private Cell[] bombs;
	private int numUnexposedRemaining;
	
	public Board(int r, int c, int b) {
		
	}
	private void initializeBoard() {
		
	}
	private boolean flipCell(Cell cell) {
		return true;
	}
	public void expandBlank(Cell cell) {
	}
	public UserPlayResult playFlip(UserPlay play) {
		UserPlayResult rs = new UserPlayResult();
		return rs;
	}
	public int getNumRemaining() {
		return numUnexposedRemaining;
	}
}
class Game_KH{
	public enum GameState{WON, LOST, RUNNING}
	
	private Board board;
	private int rows;
	private int columns;
	private int bombs;
	private GameState state;
	public Game_KH(int r, int c, int b) {
		
	}
	public boolean initialize() {
		return true;
	}
	public boolean start() {
		return true;
	}
	private boolean playGame() {
		//loops until game is over
		return true;
	}
	
}


class UserPlay{
	private int row;
	private int column;
	private boolean isGuess;
	/* constructor, getters, setters */
}
class UserPlayResult{
	private boolean successful;
	private Game_KH.GameState resultingState;
	/* constructor, getters, setters */
}
