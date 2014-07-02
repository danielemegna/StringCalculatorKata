import java.util.*;

public class StringCalculator
{
  private String NumbersSeparator;

  public StringCalculator()
  {
    this.NumbersSeparator = ",";
  }

  public int Add(String inputString)
  {
    if(inputString == "")
      return 0;

    inputString = RecognizeNewSeparatorFromInputStringCuttingIt(inputString);
    String[] splittedNumbers = SplitInputStringUsingSeparator(inputString);
    ArrayList<Integer> numbersArrayList = ConvertNumbersArrayToIntegersArrayList(splittedNumbers);

    return SumIntegersArrayList(numbersArrayList);
  }

  private int SumIntegersArrayList(ArrayList<Integer> list)
  {
    int sum = 0;
    ArrayList<Integer> notAllowedNumbers = new ArrayList<Integer>();

    for(Integer n:list) {
      if(n < 0) {
        notAllowedNumbers.add(n);
        continue;
      }

      sum += n;
    }

    ThrowRunTimeExceptionIfNeededForNotAllowedIntegerArrayList(notAllowedNumbers);
    return sum;
  }

  private void ThrowRunTimeExceptionIfNeededForNotAllowedIntegerArrayList(ArrayList<Integer> list)
  {
    if(list.size() > 0) {
      throw new RuntimeException(
        ProduceExceptionMessageForNotAllowedIntegerArrayList(list)
      );
    }
  }

  private String ProduceExceptionMessageForNotAllowedIntegerArrayList(ArrayList<Integer> list)
  {
    String exceptionMessage = "negatives not allowed";
    for(Integer n:list)
      exceptionMessage += " " + Integer.toString(n);

    return exceptionMessage;
  }

  private ArrayList<Integer> ConvertNumbersArrayToIntegersArrayList(String[] numbers)
  {
    ArrayList<Integer> result = new ArrayList<Integer>();
    for(String n:numbers) {
      result.add(Integer.parseInt(n));
    }

    return result;
  }

  private String[] SplitInputStringUsingSeparator(String inputString)
  {
    return inputString.split(this.NumbersSeparator + "|\n");
  }

  private String RecognizeNewSeparatorFromInputStringCuttingIt(String inputString)
  {
    if(inputString.startsWith("//")) {
      this.NumbersSeparator = inputString.substring(2,3);
      inputString = inputString.substring(4);
    }

    return inputString;
  } 
}

