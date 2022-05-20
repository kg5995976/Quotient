package com.arrayProgram;

public class Arrayprogram4 {
//Ascending and descending order
	public static void main(String[] args) {
	int [] arr= {2,8,83,99,47,55,31,5,69,75,20};//unsorted array
	//inbuilt function
	//Arrays.sort(arr);
	sortarray(arr);
	for(int a:arr)
	{
		System.out.println(a);
	}
	}
	
	private static void sortarray(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j]) {
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					 
				}
			}
					
				}
			}
		}
	


