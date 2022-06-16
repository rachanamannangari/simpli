package com.google;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int cntOdd=0;
	int cntEven=0;
	int a[]= {22,20,30,31,12,4,5,7};
	for (int i = 0; i < a.length; i++) {
		if (a[i]%2==0) {
			cntEven++;
		} else {
		cntOdd++;
		}
		
	}
	System.out.println("count for even" +cntEven);
	System.out.println("count for odd" +cntOdd);

	
	}
}
