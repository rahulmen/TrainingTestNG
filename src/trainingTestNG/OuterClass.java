package trainingTestNG;

import org.testng.annotations.*;;

public class OuterClass {

	public class InnerClass{
		
		public void m1(){
			System.out.println("inner Class");
		}
		
		
	}
	
	public static void main(String[] args){
	
		OuterClass obj = new OuterClass();
		OuterClass.InnerClass obj1 = obj.new InnerClass();
	obj1.m1();
	}
	
}
