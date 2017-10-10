package is.ru.hugb.stringcalculator;

public class StringCalculator {
    public int add(String numbers) {
      if(numbers == "") {
        return 0;
      }
      if(numbers.contains("-")) {
        throw new IllegalArgumentException("Negatives Not Allowed: " + getNegatives(numbers));
      }
      if(numbers.contains(",")) {
        String nums[] = numbers.split(",", 2);
        return add(nums[0]) + add(nums[1]);
      }
      if(numbers.contains("\n")) {
        String nums[] = numbers.split("\n", 2);
        return add(nums[0]) + add(nums[1]);
      }
      int number = intParser(numbers);
      if(number > 1000) {
        return 0;
      }
      return number;
    }

    public int intParser(String number) {
      return Integer.parseInt(number);
    }

    public String getNegatives(String numbers) {
      String negatives = "";
      numbers.replace("\n",",");
      if(numbers.contains(",")) {
        String nums[] = numbers.split(",");
        for(String n: nums) {
          if(n.contains("-")) {
            if(negatives == "") {
              negatives += n;
            }
            else {
              negatives += "," + n;
            }
          }
        }
        return negatives;
      }
      return numbers;
    }
}
