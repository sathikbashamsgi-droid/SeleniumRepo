package week2.day1;

public class Learnmethods {
		int noOfLearners=20;
		
		public void add() {
			int a=5,b=4;
			int c=a+b;
			System.out.println(c);
			
		}
		
		/**
		 * Method signature:
		 * AccessModifier returntype mthdname(parameters)
		 */
		
		public void addNumbers(int a,int b,float c){
			System.out.println(a+b+c);
			
		}
		
		private int noOfBicycles(){
			
			return 2;
			
		}
		
		String bicycleData(String brandName,String colour){
			return brandName+" "+colour;
			
		}
		
		public static void main(String[] args) {
			
			//how to instantiate the class?syntax:Classname obj=new classname();
			
			Learnmethods lm=new Learnmethods();
			lm.add();
			System.out.println(lm.noOfLearners);
			
	
			Learnmethods lm2=new Learnmethods();
			lm2.addNumbers(5, 6, 3.3f);
			
			int bicy = lm2.noOfBicycles();//ctrl+2,L
			System.out.println(bicy);
			System.out.println(lm2.bicycleData("honda", "red"));
		}

	}	