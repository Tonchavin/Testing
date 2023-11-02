package HomeWork1.Class;
import org.assertj.core.api.*;

import javax.management.ValueExp;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.InstanceOfAssertFactories.type;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи
    public static double squareRootExtraction(double num) {
        //  0
        //  Отрицательные числа
        //  Дробные значения корней
        //  Целые
        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(num);
    }

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount <= 0){
            throw new ArithmeticException("Не может быть отрицательной или равен 0 " + "purchaseAmount = " + purchaseAmount);
        }
        else if (discountAmount <= 0){
            throw new ArithmeticException("Скидка не может быть меньше или равна 0% " + "discountAmount = " + discountAmount);
        }
        else if (discountAmount > 100){
            throw new ArithmeticException("Не может быть большее 100% " + "discountAmount = " + discountAmount);
        }
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки(случаи: 0%, до 100%, но не больше 100% и не -%)ArithmeticException.
        return purchaseAmount - (purchaseAmount * discountAmount / 100); // Метод должен возвращать сумму покупки со скидкой
    }
}