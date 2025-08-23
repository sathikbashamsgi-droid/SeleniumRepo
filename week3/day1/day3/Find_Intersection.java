package week3.day3;

import java.util.ArrayList;
import java.util.List;

public class Find_Intersection {

	public static void main(String[] args) {
		// 
		int num1[]= {3, 2, 11, 4, 6, 7};
		int num2[] = {1, 2, 8, 4, 9, 7};
		// create array list1 
		List<Integer> number1=new ArrayList<Integer>();
		// create array list 2
		List<Integer> number2=new ArrayList<Integer>();
		//iterate num1
		for (Integer array1 : num1)
		{
			number1.add(array1);
		}
		//iterate num2
	 for (Integer array2 :num2)
		{
		 number2.add(array2);
		}
        // compare array1 & array2
	for(int i=0;i<number1.size();i++)
	{
		for(int j=0;j<number2.size();j++)
		{
			if(number1.get(i)==number2.get(j))
				
			{
				System.out.println("same numbers are:"+number1.get(i));
			}
		    }
		
		}
		
	}

}
