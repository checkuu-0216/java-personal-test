package calculator;

import java.util.Queue;
import java.util.LinkedList;

public class ArithmeticCalculator extends Calculator {
    static Queue<Double> intQueue = new LinkedList<Double>();
    private double result;

    public ArithmeticCalculator() {
        super();
    }

    public double add(int num1, int num2) {
        result = num1 + num2;
        setResult((int) result);
        intQueue.add(result);
        return result;
    }

    public double sub(int num1, int num2) {
        result = num1 - num2;
        setResult((int) result);
        intQueue.add(result);
        return result;
    }

    public double mul(int num1, int num2) {
        result = num1 * num2;
        setResult((int) result);
        intQueue.add(result);
        return result;
    }

    public double div(int num1, int num2) throws Exception {
        if (num2 == 0) {
            throw new Exception();
        } else
        result = num1 / num2;
        setResult((int) result);
        intQueue.add(result);
        return result;
    }

    public void calculate(char operator, int num1, int num2) throws Exception {
        switch (operator) {
            case '+':
                add(num1, num2);
                break;
            case '-':
                sub(num1, num2);
                break;
            case '*':
                mul(num1, num2);
                break;
            case '/':
                div(num1, num2);
                break;
            default:
                System.out.println("사칙 연산외에 다른 기호가 들어갈 수 없습니다.");
        }
        System.out.println("계산 기록 : " + intQueue); // 디버깅 출력
    }

    public static void removeResult() {
        intQueue.remove(); // Queue를 이용해 만든 배열의 첫 항을 삭제하기 위한 메서드
    }

    public static void inquiryResult() {
        for (Double result : intQueue) {
            System.out.println(result); //inquiry 진행을 위한 메서드
        }
    }
}
