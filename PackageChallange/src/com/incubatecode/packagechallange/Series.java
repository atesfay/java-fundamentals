package com.incubatecode.packagechallange;
/*
 * Create a suitable named package containing a class called Series
 * With the following static methods.
 * 	1. findnSum(int n)
 * 	2. findFactorial(int n)
 * 	3. findFibonacci(int n
 * 
 * Create a new project and add your Series library, then test the three 
 * methods in the main() method of your new project.
 * 
 * for (int i = 0, i <= 10, i++){
 * 		System.out.println(Series.findnSum(i))
 * }
 * 
 * for (int i = 0, i <= 10, i++){
 * 		System.out.println(Series.findFactorial(i))
 * }
 * for (int i = 0, i <= 10, i++){
 * 		System.out.println(Series.findFibonacci(i))
 * }
 * 
 * findFactorial
 * 
 * */
public class Series {
	
	/* findnSum() method 
	 * returns the sum of all number from to n. 
	 * The first 10 numbers are : 0,1,3,6,10,15,21,28,36,45,55
	 * 
	 * @param n
	 * @return n
	 */
	public static long findnSum(int n){
		return (n * (n + 1)) / 2;
	}
	
	/* findFactorial method 
	 * returns the product of all number from 0 to n 
	 * - i.e 1 * 2 * 3 * 4 ...* (n-1) * n 
	 * The first 10 numbers are : 
	 * 0,1,2,6,24,120,720,5040,40320,362880,3628800
	 * 
	 * @param n
	 * @return factorial
	 */
	public static long findFactorial(int n){
		if (n == 0){
			return 1;
		}
		long factorial = 1;
		for (int i = 0; i < n; i++) {
			factorial *= i;
		}
		return factorial;
	}
	
	/* findFibonacci method 
	 * returns the nth Fibonacci(n) number of all number from 0 to n 
	 * f(0) = 0
	 * f(1) = 1
	 * f(n) = f(n-1) + f(n-2)
	 * so f(2) is also 1. t 
	 * The first 10 numbers are : 
	 * 0,1,1,2,3,5,8,13,21,34,55
	 * 
	 * @param n
	 * @return factorial
	 */
	public static long findFibonacci(int n){
		if (n == 0){
			return 0;
		}else if (n == 1){
			return 1;
		}
		
		long nMinus1 = 1;
		long nMinus2 = 0;
		long fibonacci = 0;
		
		for (int i = 1; i < n; i++){
			fibonacci = (nMinus2 + nMinus1);
			nMinus2 = nMinus1;
			nMinus1 = fibonacci;
		}
		
		return fibonacci;
	}

}
