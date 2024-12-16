package com.greatlearning.datastrcuture.gp2.q1;

import java.util.Scanner;
import com.greatlearning.datastrcuture.gp2.q1.Service;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service s= new Service();
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the total no of floors in the building");
		int numFloor=sc.nextInt();
		
		int[] floor = new int[numFloor];
		
		   
		for(int i=1; i<numFloor+1; i++)  
		{  
		System.out.println("Enter the floor size given on day : "+i);
		floor[i-1] = sc.nextInt(); 
		}  
		System.out.println();
		
		
		s.numConstruction(floor, numFloor);

	}

}
