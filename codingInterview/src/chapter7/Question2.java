package chapter7;

import java.util.Queue;

public class Question2 {
	public class CallCenter{
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
		public void dispatchCall(call c) {
			if(c.callRank == 3) {
				//directors가 꽉찼는지 보고 할당 or 콜큐에 넣
			}
			//반복....
		}
	}
	public class employee{
		Status workerStatus = Status.free;
	}
	public class call{
		private int callRank;
		public call(int callRank) {
			this.callRank = callRank;
		}
		
	}
	enum Status{
		busy, free;
	}
	public static void main(String[] args) {
		Question2 test = new Question2();
		Question2.CallCenter cs = new Question2.CallCenter(10,4,2);
		// 이거 어케함 ㅡㅡ?
	}
}
