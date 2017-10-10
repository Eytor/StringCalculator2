package is.ru.hugb.stringcalculator;

public class StringCalculator {
    public int add(String numbers) {
      if(numbers == "") {
        return 0;
      }
      return intParser(numbers);
    }

    public int intParser(String number) {
      return Integer.parseInt(number);
    }
}
