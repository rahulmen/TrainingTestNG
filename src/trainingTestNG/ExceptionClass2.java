package trainingTestNG;

public class ExceptionClass2  {
	
	public static void main(String[] args){
		
		try{
		throw new ExceptionClass("Insufficient balance");
		}catch(ExceptionClass e){
			System.out.println("Exception Occur");
		}
		
	}

}
 