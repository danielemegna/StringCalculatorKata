import org.junit.*;

public class TestStringCalculator
{
	private StringCalculator sc;

	@Before
	public void init()
	{
		sc = new StringCalculator();
	}

	@Test
	public void assertingThatTrueIsTrue()
	{
		Assert.assertTrue(true);
	}

	@Test
	public void stringCalculatorReturnMeTrueShouldReturnTrue()
	{
		Assert.assertTrue(sc.ReturnMeTrue());
	}

	@Test
	public void stringCalculatorAddMethodWithEmptyStringShouldReturnZero()
	{
		Assert.assertEquals(0, sc.Add(""));
	}

	@Test
	public void scAddWithOneShouldReturnOne()
	{
		Assert.assertEquals(1, sc.Add("1"));
	}

	//public void scAddWithOneAndTwoShouldReturnThree()

}
