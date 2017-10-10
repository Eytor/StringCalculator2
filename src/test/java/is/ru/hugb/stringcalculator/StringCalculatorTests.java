package is.ru.hugb.stringcalculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTests {
  @Test
  public void TestEmpty() {
    StringCalculator calc = new StringCalculator();
    assertEquals(0, calc.add(""));
  }
}
