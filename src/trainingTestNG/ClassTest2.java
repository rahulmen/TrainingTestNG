package trainingTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTest2 {

	@Parameters("test")
	@Test(groups={"Regression"},priority=1)
	public void method2(String str)
	{
		System.out.println("Executioon end :"+ str);
	}
	
	@Parameters("test")
	@Test(priority=2,groups={"Regression"})
	public void method3(String str){
		System.out.println("Execution Completed :"+ str);
	}
	
	
}
