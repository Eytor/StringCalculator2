package is.ru.hugb.stringcalculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTests {
  @Test
  public void TestEmpty() {
    StringCalculator calc = new StringCalculator();
    assertEquals(0, calc.add(""));
  }
  @Test
  public void TestOneNumber() {
    StringCalculator calc = new StringCalculator();
    assertEquals(1, calc.add("1"));
  }
  @Test
  public void TestTwoNumber() {
    StringCalculator calc = new StringCalculator();
    assertEquals(3, calc.add("1,2"));
  }
  @Test
  public void TestUnkownAmmountOfNumbers() {
    StringCalculator calc = new StringCalculator();
    assertEquals(10, calc.add("1,2,3,4"));
  }
}
