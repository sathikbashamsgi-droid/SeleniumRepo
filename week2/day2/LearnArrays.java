package week2.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		/**
		 * Arrays:
		 * -collection of items of same datatype
		 * implementations:
		 * 1)Array literal->syn:datatype v.name[]={values}
		 *                -memory space will be created based on the data
		 * 2)Array instantiation
		 */
		//ArrayLiteral
		int marks[]= {87,98,65,90,64};//index starts from 0
		//length of the array
		int arrLength = marks.length;
		System.out.println(arrLength );
		//all the values
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);}
			//sorting an array
			Arrays.sort(marks);//{64,65,87,90,98)
			System.out.println(marks[3]);
			//max value in the array
			System.out.println(marks[arrLength-1]);//last index=length-1
		//Array instantiation
			int marks1[]=new int[5];
			marks1[0]=65;
			marks1[1]=68;
			marks1[2]=69;
			System.out.println("values from instantiation:"+marks1[3]);//1,2,3
			String learners[]=new String[3];
			learners[0]="dilipkumar";
			learners[1]="Banupriya";
			//learners[2]="ArunKumar";
			System.out.println(learners[3]);
		

	}

}