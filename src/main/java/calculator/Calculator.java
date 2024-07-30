package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private static Queue<Integer> intQueue = new LinkedList<>(); //Calculator에 remove를 넣기위한 Queue 생성
    //operator = char
    //num1 , num2 = int
    private int num1;
    private int num2;
    private int result; //결과 값 캡슐화

    public int getResult() {
        return result; //캡슐화된 result를 불러오는 메서드
    }

    public void setResult(int result) {
        this.result = result; //간접 수정을 위한 setter
    }

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
        }// 연산 작업을 calculator에서 하기위한 메서드
    }

    public static void removeResult(Queue<Integer> intQueue) {
        intQueue.remove(); //Queue를 이용해 만든 배열의 첫항을 삭제하기 위한 메서드
    }

}
