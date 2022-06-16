package com.google;

public class Arrayop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[]= {8,7,90,34,2,99};
int l=arr1[0];
int m=arr1[0];
for (int i = 0; i < arr1.length; i++) {
	if (arr1[i]>l) {
		l=arr1[i];
		
	} else if(arr1[i]<m) {
m=arr1[i];
	}
	
}
System.out.println("largest number is" +l);
System.out.println("smallest number is" +m);

}

} 

	


