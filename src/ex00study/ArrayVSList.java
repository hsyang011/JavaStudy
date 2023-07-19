package ex00study;

import java.util.LinkedList;

public class ArrayVSList {

	public static void main(String[] args) {
		int[] arr;
		
		
		int[] arr2 = new int[10];
		int[] arr3 = { 30, 40, 50, 60, 70 };
		
		arr = arr3;
		arr[0] = 10;
		System.out.printf("%d\n", arr3[0]);
	
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(30);
		list.add(70);
		
		System.out.printf("%d\n", list.get(0));
		System.out.printf("%d\n", list.get(1));
	}

}
