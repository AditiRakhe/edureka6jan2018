package co.edureka.cols;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		//PriorityQueue<Integer> q1 = new PriorityQueue<>();
		Queue<Integer> q1 = new PriorityQueue<>();
		
		// 10 to 0, data is added |  		     (Head) 10 9 8 7 6 5 4 3 2 1 0 (Tail)
		for(int i=10;i>=0;i--){
			q1.add(i);
		}
		
		// PrioirtyQueue Sorts the data for us | (Head) 0 1 2 3 4 5 6 7 8 9 10 (Tail)
		
		/*int element = q1.peek(); // peek returns the head of queue
		System.out.println(element);

		element = q1.poll(); // poll return the head and removes the head as well from queue
		System.out.println(element);
		
		element = q1.peek(); // 1 as a head now
		System.out.println(element);*/
		
		int sz = q1.size();
		
		for(int i=0;i<sz;i++){
			System.out.println(q1.poll());
		}
	}

}
