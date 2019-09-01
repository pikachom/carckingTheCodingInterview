package chapter8;

import java.util.Stack;

public class Question6 {
	class Hanoi{		
		Stack<Disk> firstTower = new Stack<Disk>();
		Stack<Disk> secondTower = new Stack<Disk>();
		Stack<Disk> thirdTower = new Stack<Disk>();
		public Hanoi(int levels) {
			for(int i=1; i<=levels; i++) {
				Disk tempDisk = new Disk(i); 
				this.firstTower.add(tempDisk);
			}
		
		}
		void moveDisk(int numDiskToMove, int destination) {
			//움직이는거 만들고...과정마다 프린트하고...ㅎ
		}
	}
	class Disk{
		int level;
		public Disk(int level) {
			this.level = level;
		}
	}
	
	public static void main(String[] args) {
		Question6 test = new Question6();
		Hanoi hanoi = test.new Hanoi(5);
	}
}
