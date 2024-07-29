package calculator;

public class Calculator {
    //operator = char
    //num1 , num2 = int
    int num1;
    int num2;
    int result;

    public Calculator() {
    }

    public int add(int num1, int num2) {
        result = num1 + num2;
        return result;
    }

    public int sub(int num1, int num2) {
        result = num1 - num2;
        return result;
    }

    public int mul(int num1, int num2) {
        result = num1 * num2;
        return result;
    }


    public int div(int num1, int num2){
        if (num2 == 0) {
            throw new ArithmeticException("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
        } else
            result = num1 / num2;
        return result;
    }
}
