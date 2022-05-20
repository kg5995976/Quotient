package com.arrayProgram;

public class Linearserachprogram {

	public static void main(String[] args) {
		int[] arr= {1,88,74,54,62,7,56,94,35,78,45};
		System.out.println(linearsearchforelement(arr,56));
		System.out.println(linearsearchforelement(arr,10));

	}

	private static int linearsearchforelement(int[] arr, int ele) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele) {
				return i;
			}
		}
		return -1;
		
	}

}
