package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementList {

	public static void main(String[] args) {
		// 
		int numbers[]= {1,2,3,4,10,6,8};
		List<Integer> list = new ArrayList<Integer>();
		for (Integer each : numbers) {
			list.add(each);
		}
		Collections.sort(list);
         System.out.println(list);
         
         for(int i=0;i<list.size()-1;i++)
        	 
         {
        	 int j=list.get(i)+1;
      
        	 if(j==list.get(i+1))
        	 {
        		 continue;
        	 }
        	 else {
        		 System.out.println("Missing element is :"+(list.get(i)+1));
         }
	

        }
	}
}
