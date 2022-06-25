package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void initSetup() {
        calculator = new Calculator();
    }

    @Test
    public void test_addTwoNumbers() {
        int result = calculator.addTwoNumbers(6, 3);
        Assertions.assertEquals(result, 3);
    }

    @Test
    public void test_subtractTwoNumbers() {
        int result = calculator.subtractTwoNumbers(8, 4);
        Assertions.assertEquals(result, 4);
    }

    @Test
    public void test_divideTwoNumber() {
        int divideVariable = calculator.divideTwoNumbers(10, 2);
        Assertions.assertEquals(divideVariable, 5);
    }

    @Test
    public void test_multiplyTwoNumbers() {
        int multiplyValues = calculator.multiplyTwoNumbers(4, 5);
        Assertions.assertEquals(multiplyValues, 20);
    }
}

