package calculator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {

    @DataProvider(name = "calculatorTestData")
    public Object[][] createData() {

        return new Object[][] {
                {2, 2, 4},
                {1, 1, 3},
                {5, 4, 9}
        };
    }

    @Test(dataProvider = "calculatorTestData")
    public void add(int one, int two, int total) {

        Calculator calc = new Calculator();

        calc.add(one);

        calc.add(two);

        assertEquals(total, calc.getTotal());
    }
}
