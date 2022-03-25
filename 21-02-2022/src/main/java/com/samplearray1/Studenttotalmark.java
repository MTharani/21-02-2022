package com.samplearray1;

import java.util.Scanner;

public class Studenttotalmark {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the array length:");
		int count=sc.nextInt();    //get the array length
		int total[]=new int[count];  //assign the array length
		int i=0;
		while(i<count)  //while condition Ex;(0<5)
		{
			System.out.println("enter the number");
			total[i]=sc.nextInt(); //get the total mark
			i++;
		}
		for(i=0;i<count;i++) //for loop condition 
		{
			System.out.println("total mark is:"+total[i]);//print the total mark
		}
		sc.close();  //close the scanner
		

	}

}
