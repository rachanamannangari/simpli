package com.google;

public class Arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int aar[]= {3,66,4,29,90};
for (int i = 0; i < aar.length; i++) {
	for (int j = i+1; j < aar.length; j++) {
		if(aar[i]<aar[j])
		{
			int t=aar[i];
			aar[i]=aar[j];
			aar[j]=t;
		}
	}
	System.out.println(aar[i]);
	
}
	}

}
