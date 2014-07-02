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
		Assert.assertTrue(sc.returnMeTrue());
	}
}
