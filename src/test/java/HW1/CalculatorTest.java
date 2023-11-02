package HW1;

import HomeWork1.Class.Calculator;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.InstanceOfAssertFactories.type;

import static HomeWork1.Class.Calculator.calculatingDiscount;


public class CalculatorTest {
    public static void main(String[] args) {
        assertThat(Calculator.calculatingDiscount(200,10)).isEqualTo(180);
//        assertThat(Calculator.calculatingDiscount(0,10)).isEqualTo(180);
//        assertThat(Calculator.calculatingDiscount(200,0)).isEqualTo(180);
//        assertThat(Calculator.calculatingDiscount(-200,10)).isEqualTo(180);
//        assertThat(Calculator.calculatingDiscount(200,-10)).isEqualTo(180);
//        assertThat(Calculator.calculatingDiscount(200,110)).isEqualTo(180);
//        assertThatThrownBy(() ->Calculator.calculatingDiscount(aa,10))
//                .isInstanceOf(IllegalStateException.class);
//        assertThatThrownBy(() ->Calculator.calculatingDiscount(200,aa))
//                .isInstanceOf(IllegalStateException.class);
    }
}
