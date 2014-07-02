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
      Assert.assertEquals(0, sc.Add("0"));
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

  @Test
    public void scAddWithThreeNumbersShouldReturnSumValue()
    {
      Assert.assertEquals(7, sc.Add("1,2,4")); 
      Assert.assertEquals(12, sc.Add("3,4,5")); 
      Assert.assertEquals(32, sc.Add("16,16,0")); 
      Assert.assertEquals(0, sc.Add("0,0,0")); 
      Assert.assertEquals(256, sc.Add("16,40,200")); 
      Assert.assertEquals(205, sc.Add("100,90,15")); 

    }

  @Test
    public void scAddWithNewlineDelimitersShouldWorkProperly()
    {
      Assert.assertEquals(6, sc.Add("1\n2,3"));
      Assert.assertEquals(9, sc.Add("4\n2\n3"));
      Assert.assertEquals(5, sc.Add("2,2\n1"));
    }

  @Test
    public void scAddWithDifferentDelimiterShouldWorks()
    {
      Assert.assertEquals(10, sc.Add("//;\n6;4"));
      Assert.assertEquals(14, sc.Add("//#\n9#5"));
      Assert.assertEquals(23, sc.Add("// \n17 6"));
    }

  @Test
    public void scAddWithNegativeNumbersShouldThrowsAnException()
    {
      try
      {
        sc.Add("-5");
        Assert.fail("Should have thrown RuntimeException but did not!");
      }
      catch(RuntimeException ex)
      {
        Assert.assertEquals("negatives not allowed -5", ex.getMessage());
      }

      try
      {
        sc.Add("-7,3,-1");
        Assert.fail("Should have thrown RuntimeException but did not!");
      }
      catch(RuntimeException ex)
      {
        Assert.assertEquals("negatives not allowed -7 -1", ex.getMessage());
      }
    }

}
