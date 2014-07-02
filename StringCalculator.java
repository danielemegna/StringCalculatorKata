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

		if(numbers.contains(",")) {
			
      String[] parts = numbers.split(",");
      
      int part0 = Integer.parseInt(parts[0]);
      int part1 = Integer.parseInt(parts[1]);
      
      return part0+part1;
    }

    return Integer.parseInt(numbers);
	}
}
