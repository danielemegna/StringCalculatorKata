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
