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

	@Test
	public void scAddWithOneAndTwoShouldReturnThree()
	{
		Assert.assertEquals(3, sc.Add("1,2"));
	}

  @Test
  public void scAddWithSingleNumbersShouldReturnIntValue()
  {
    Assert.assertEquals(2, sc.Add("2"));
    Assert.assertEquals(5, sc.Add("5"));
    Assert.assertEquals(23, sc.Add("23"));
    Assert.assertEquals(160, sc.Add("160"));
  }

  @Test
  public void scAddWithPairOfNumberShouldReturnSumValue()
  { 
    Assert.assertEquals(5, sc.Add("3,2"));
    Assert.assertEquals(8, sc.Add("5,3"));
    Assert.assertEquals(16, sc.Add("8,8"));
    Assert.assertEquals(273, sc.Add("273,0"));
    
  }

}
