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

		if(numbers == "1")
			return 1;

		return -1;
	}
}
