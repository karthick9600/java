package java.awt.geom;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {50,30,40,20,10}
	System.out.println(Arrays.toString(arr));
		int res[]=bublesort(arr);
		System.out.println((Arrays.toString(res));
		int[] bublesort(int arr1[]) {
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1.length;j++) {
					if(arr1[j]>arr[j+1]) {
						int temp=arr1[j];
						arr1[j]=arr1[j+1];
						arr1[j+1]=temp;
					}
				}
				
			}
		}
	}

	private static int[] bublesort(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
