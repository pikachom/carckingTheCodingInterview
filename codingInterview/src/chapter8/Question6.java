package chapter8;

import java.util.Stack;

public class Question6 {
	class Hanoi{		
		Tower[] towers = new Tower[3];
		
		public Hanoi(int levels) {
			for(int i=0; i<3; i++) {
				towers[i] = new Tower(i);
			}
			for(int i=1; i<=levels; i++) {
				Disk tempDisk = new Disk(levels+1-i); 
				towers[0].diskStack.push(tempDisk);
			}
		
		}
		void moveDisk(int numDiskToMove, Tower from, Tower to, Tower buffer) {
			if(numDiskToMove>0) {
				showStatus();
				moveDisk(numDiskToMove-1, from, buffer, to);
				from.moveTopTo(to);
				moveDisk(numDiskToMove-1, buffer, to, from);
			}
		}
		void showStatus() {
			for(Tower t : towers) {
				StringBuilder sb = new StringBuilder();
				sb.append(t.index);
				sb.append("th tower : ");
				for(Disk d : t.diskStack) {
					sb.append(d.level);
					sb.append("-");
				}
				System.out.println(sb);
			}
			System.out.println("===================");
		}
	}
	class Tower{
		Stack<Disk> diskStack;
		int index;
		
		
		public Tower(int i) {
			diskStack = new Stack<Disk>();
			index = i;
		}
		
		public void moveTopTo(Tower t) {
			if(!t.diskStack.isEmpty()&&t.diskStack.peek().level<=this.diskStack.peek().level) {
				System.out.println("cannot put bigger disk on top!!");
			}else {
				Disk top = this.diskStack.pop();
				t.diskStack.push(top);
			}
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
		hanoi.showStatus();
		Tower t1 = hanoi.towers[0];
		Tower t2 = hanoi.towers[1];
		Tower t3 = hanoi.towers[2];
		System.out.println("HANOI MOVE START!!");
		hanoi.moveDisk(5, t1, t3, t2);
		System.out.println("HANOI MOVE FINISHED!!");
		hanoi.showStatus();
	}
}
