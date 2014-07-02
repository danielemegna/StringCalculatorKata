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
    for(String part:parts) {
      sum += Integer.parseInt(part);
    }

    return sum;
	}
}
