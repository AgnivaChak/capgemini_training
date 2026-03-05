package exception_handling;

public class CustomException {
	public static void caclResult(double percentage)
	{
		if(percentage >0 && percentage <=100)
		{
			if(percentage >45) {
				System.out.println("Passed");
			}
		}
		else {
			throw new InvalidPercentageException("Percentage is invalid");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Program started");
		try {
		caclResult(120);
	}
		catch(InvalidPercentageException e){
			System.out.println(e.getMessage());
		}
			
		}

}