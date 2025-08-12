package week1.day2;

public class LearnFibonacciSeries {

	public static void main(String[] args) {
		// find Fibonacci Series for input(range): 8 
				// Fibonacci Series are 0 1 1 2 3 5 8 13 21 34 .....n
				
				int num =8, a=0, b=1; // num = input range, a=first no of Fibonacci series,b=second number of Fibonacci series
				System.out.print("Fibonacci series: " +a+" "+b );
				//create for loop from 3 to 8th range
				for (int i = 3; i<=num; i++) {
					
			
					int sum =a+b; //0+1--->1+1--->1+2--->2+3--->3+5--->5+8
					System.out.print(" "+sum); //1--->2--->3--->5--->8--->13
					a=b; //a=1--->a=1--->a=2--->a=3--->a=5
					b=sum; //b=1--->b=2--->b=3--->b=5--->b=8
					
					
				}
				
			}

		}
		
