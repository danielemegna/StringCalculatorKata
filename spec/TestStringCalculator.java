import org.junit.*;

public class TestStringCalculator
{

	@Test
	public void assertingThatTrueIsTrue()
	{
		Assert.assertTrue(true);
	}

	@Test
	public void stringCalculatorReturnMeTrueShouldReturnTrue()
	{
		StringCalculator sc = new StringCalculator();
		Assert.assertTrue(sc.ReturnMeTrue());
	}

	@Test
	public void stringCalculatorAddMethodWithEmptyStringShouldReturnZero()
	{
		StringCalculator sc = new StringCalculator();
		Assert.assertEquals(0, sc.Add(""));
	}
}
