package is.ru.hugb.stringcalculator;

public class StringCalculator {
    public int add(String numbers) {
      if(numbers == "") {
        return 0;
      }
      if(numbers.contains(",")) {
        String nums[] = numbers.split(",");
        return intParser(nums[0])+intParser(nums[1]);
      }
      return intParser(numbers);
    }

    public int intParser(String number) {
      return Integer.parseInt(number);
    }
}
