package is.ru.hugb.stringcalculator;

public class StringCalculator {
    public int add(String numbers) {
      if(numbers == "") {
        return 0;
      }
      if(numbers.contains(",")) {
        String nums[] = numbers.split(",",2);
        return add(nums[0]) + add(nums[1]);
      }
      if(numbers.contains("\n")) {
        String nums[] = numbers.split("\n");
        int ammount = 0;
        for(String n:nums) {
          ammount += intParser(n);
        }
        return ammount;
      }
      return intParser(numbers);
    }

    public int intParser(String number) {
      return Integer.parseInt(number);
    }
}
