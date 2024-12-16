package com.greatlearning.datastrcuture.gp2.q1;
import java.util.*;

public class Service {
	public void numConstruction(int floor[],int numFloor) {
		
		
		
		int total = numFloor;
		PriorityQueue<Integer> que = new PriorityQueue<>(java.util.Collections.reverseOrder());

	

		
		
		
		System.out.println("The order of construction is as follows");
		System.out.println();
		for (int i = 0; i < numFloor; i++) {

			System.out.println("Day: "+(i+1));
			
			
	

			que.add(floor[i]);


			while (!que.isEmpty() && que.peek() == total) {

				System.out.print(que.poll() + " ");

				total=total-1;

			}

			System.out.println();

		}

	  }
}
