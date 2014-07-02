public class StringCalculator
{
	public boolean ReturnMeTrue()
	{
		return true;
	}

	public int Add(String numbers)
	{
    
		if(numbers == "")
			return 0;

    String sep = ",";
    if(numbers.startsWith("//")) {
      sep = numbers.substring(2,3);
      numbers = numbers.substring(4);
    }
     
    String[] parts = numbers.split(sep + "|\n");

    int sum = 0;
    String exceptionMessage = "negatives not allowed";

    for(String part:parts) {
      int n = Integer.parseInt(part);

      if(n < 0)
        exceptionMessage += (" " + Integer.toString(n));

      sum += n;
    }
  
    if(exceptionMessage != "negatives not allowed")
      throw new RuntimeException(exceptionMessage);
        
    return sum;
	}
}
