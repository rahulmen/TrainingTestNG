package trainingTestNG;

import org.testng.annotations.*;;

public class OuterClass2 {

	
	public static void main(String[] args){
	
	OuterClass obj = new OuterClass(){
		
		public void m1(){
			System.out.println("this is anomour class");
		}
	};
		
		
	}
	
}
