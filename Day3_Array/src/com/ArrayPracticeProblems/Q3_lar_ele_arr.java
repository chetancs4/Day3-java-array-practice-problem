package com.ArrayPracticeProblems;

import java.util.Scanner;

public class Q3_lar_ele_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of integers in array:- ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter " + arr.length + " integer values:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("Largest element are: " + max);
	}

}
