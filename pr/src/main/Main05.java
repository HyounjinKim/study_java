package main;

import java.util.Scanner;

public class Main05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int i;
		
		for(i = 0; i <= n; i++) {
			a += i;			
		}
		System.out.println(a);
	}

}
