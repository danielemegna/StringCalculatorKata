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

    if(numbers.startsWith("//")) {
      String sep = numbers.substring(2,3);
      
      numbers = numbers.substring(4);
      String[] parts = numbers.split(sep);

      int sum = 0;
      for(String part:parts) {
        sum += Integer.parseInt(part);
      }

      return sum;
    }
    
		if(numbers.contains(",") || numbers.contains("\n")) {
      String[] parts = numbers.split(",|\n");

      int sum = 0;
      for(String part:parts) {
        sum += Integer.parseInt(part);
      }

      return sum;
    }

    return Integer.parseInt(numbers);
	}
}
