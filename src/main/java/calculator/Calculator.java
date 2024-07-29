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

    public int div(int num1, int num2) throws Exception {
        if (num2 == 0) {
            throw new Exception();
        } else
            result = num1 / num2;
        return result;
    }

    public void calculate(char operator, int num1, int num2) throws Exception {
        switch (operator){
            case '+' :
                add(num1,num2);
                break;
            case '-' :
                sub(num1,num2);
                break;
            case '*' :
                mul(num1,num2);
                break;
            case '/' :
                div(num1,num2);
                break;
            default:
                System.out.println("사칙 연산외에 다른 기호가 들어갈 수 없습니다.");
        }
    }


}
