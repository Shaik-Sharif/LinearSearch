package Arrays;

import java.util.Scanner;

//Take an array as input from the user. Search for a given 
//number x and print the index at which it occurs
public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int number[] = new int [size];
		
		for(int i =0; i<size;i++) {
			number[i] = sc.nextInt();
		}
		
	}

}

