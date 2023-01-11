package com.paul.hw2;

public class Expression {

	public static void main(String[] args) {
		int i,j,sum = 0;
		for (i= 1, j= 2 ; i <= 49 ; i+=2 , j+=2) {
			
			sum+=(i*i) - (j*j);
			
		}
		
		System.out.println(sum);
	}
}

// Method2

/*public static void main(String[] args) {
	int sum = 0;
	for (int n = 1 ; n <= 4 ; n++) {
		
		sum+=(Math.pow(-1, (n+1)) * (n * n));
	}
	
	System.out.println(sum);

}*/