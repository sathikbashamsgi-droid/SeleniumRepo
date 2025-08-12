package week1.day2;

public class Learnoperators {

	public static void main(String[] args) {
		//Arithmetic operators
				System.out.println(4+3);
				System.out.println(6*3);
				System.out.println(4/2);//quotient
				System.out.println(11%2);//remainder
				//Assignment
				int a=7,b=10;
				a+=5;//a=a+5--->7+5=12
				System.out.println(a);
				b*=3;//b=b*3--->10*3=30
				System.out.println(b);//30
				b-=5;//b=b-5--->30-5=25
				System.out.println(b);//25
				//comparison operators
				System.out.println(5==4);//boolean--->true or false
				System.out.println(5!=6);
				
				//logical operators
				System.out.println((5==5)&&(5<5));//1*0--->0-->false
				System.out.println((5!=6)||(5>5));//1+0--->1--->true
				System.out.println((5==5)&&(5<5)||(7==7));//1*0--->0+1--->1--->true
				
				//unary operators
				//increment operators
				int x=1,c=5;
				System.out.println(++x);//2
				System.out.println(x++);//2
				System.out.println(x);//3
				System.out.println(c--);
				System.out.println(c);
				
				
			}

		}
