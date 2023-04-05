package com.ArrayPracticeProblems;

import java.util.Scanner;

public class Q5_ele_Even_pos {

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

		for (int i = 1; i < arr.length; i = i + 2) {
			System.out.println(arr[i]);
		}

	}

}
