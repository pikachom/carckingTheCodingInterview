package chap1;

public class Question5 {
	
	public boolean insertCheck(String firstStr, String secondStr) {
		return true;
	}
	public boolean removeCheck(String firstStr, String secondStr) {
		return true;
	}
	public boolean replaceCheck(String firstStr, String secondStr) {
		return true;
	}
	public boolean oneAway(String firstStr, String secondStr) {
		return insertCheck(firstStr,secondStr)||removeCheck(firstStr,secondStr)||replaceCheck(firstStr,secondStr);
	}

}
