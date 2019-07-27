package chapter7;

import java.util.Queue;

public class Question2 {
	public static void main(String[] args) {
		Question2 test = new Question2();
		//Question2.CallCenter cs = new Question2.CallCenter(10,4,2);
		// 이거 어케함 ㅡㅡ?
	}
}
class CallCenter{
	private int respondentNum;
	private int managerNum;
	private int directorNum;
	private employee[] respondents;
	private employee[] managers;
	private employee[] directors;
	private Queue<call> callQueue;
	public CallCenter(int respondentNum, int managerNum, int directorNum) {
		this.respondentNum = respondentNum;
		this.managerNum = managerNum;
		this.directorNum = directorNum;
		this.respondents = new employee[respondentNum];
		this.managers = new employee[managerNum];
		this.directors = new employee[directorNum];
		
	}
	public void enqueueCall(call c) {
		this.callQueue.add(c);
	}
	public call dequeueCall(){
		call c = this.callQueue.poll();
		return c;
	}
	public boolean dispatchCall(call c) {
		boolean result = false;
		if(c.callRank == 3) {
			result = directorGetCall(c);
			
		}else if(c.callRank == 2) {
			result = managerGetCall(c);
			if(!result){
				result = directorGetCall(c);
			}
			
		}else if(c.callRank == 1) {
			result = respondentGetCall(c);
			if(!result) {
				result = managerGetCall(c);
				if(!result) {
					result = directorGetCall(c);
				}
			}
		}
		return result;
	}
	public boolean directorGetCall(call C) {
		for(int n=0;n<directors.length;n++) {
			if(directors[n].workerStatus==Status.free) {
				directors[n].workerStatus=Status.busy;
				return true;
			}
		}
		return false;
	}
	public boolean managerGetCall(call C) {
		for(int n=0;n<managers.length;n++) {
			if(managers[n].workerStatus==Status.free) {
				managers[n].workerStatus=Status.busy;
				return true;
			}
		}
		return false;
	}
	public boolean respondentGetCall(call C) {
		for(int n=0;n<respondents.length;n++) {
			if(respondents[n].workerStatus==Status.free) {
				respondents[n].workerStatus=Status.busy;
				return true;
			}
		}
		return false;
	}
}

class employee{
	Status workerStatus = Status.free;
}
class call{
	public int callRank;
	public call(int callRank) {
		this.callRank = callRank;
	}
	
}
enum Status{
	busy, free;
}
	
