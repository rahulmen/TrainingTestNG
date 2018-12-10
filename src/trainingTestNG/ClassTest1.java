package trainingTestNG;

import javax.swing.Action;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ClassTest1 {
	
	@Parameters("test")
	@Test(groups={"Sanity","Regression"})
	public void method1(String str){
		System.out.println("Execution start :"  + str);
		}
	

	@Parameters({"test","final"})
	@Test(dependsOnMethods = {"method1"})
	public void method2(String str1,String str2){
		System.out.println("Execution in progress");
		System.out.println(str1 + str2);
		
		
	}
	
	@DataProvider(name = "getData")
	public Object getdata(){
		
		Object[][] obj = new Object[2][2];
	
		
		return obj;
		

	
		
		
	}

}
