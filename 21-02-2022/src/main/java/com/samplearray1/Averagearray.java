package com.samplearray1;

public class Averagearray {

	public static void main(String[] args) {
		// write a java program to calculate the average value of array element
		int add[]= {2,5,2,0,1};
		int sum=0;
		for(int i=0;i<add.length;i++)
		{
			sum=sum+add[i];
			sum=sum%add.length;
		}
        System.out.println("Average of array element:" +sum);
	
	}

}
