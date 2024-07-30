package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private static Queue<Integer> intQueue; //Calculator에 remove를 넣기위한 Queue 생성
    private static Queue<Double> circleQueue;
    private int num1;
    private int num2;
    private double num3;
    private final double pie = 3.1415; //final로 한 이는 pie의 값은 변하지 않는 값이고 해당 값이 변경되는것을 막기위해 final을 썻다.
    private double circleResult;
    private int result; //결과 값 캡슐화

    public double getCircleResult() {
        return circleResult;
    }

    public void setCircleResult() {
        this.circleResult = circleResult;
    }

    public int getResult() {
        return result; //캡슐화된 result를 불러오는 메서드
    }

    public void setResult(int result) {
        this.result = result; //간접 수정을 위한 setter
    }

    public Calculator() {
        intQueue = new LinkedList<>(); //Calculator에 intQueue 생성해주고 Main App에 result를 intQueue에 넣어주는 식 삭제
        circleQueue = new LinkedList<>(); //원넓이 구하는 인스턴스 생성
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
        intQueue.add(result); // 계산 결과를 큐에 추가
        // main에서 추가를 했는데 inquiry가 작동을 안해서 Calculator class에 넣었더니 오류해결됨.
        System.out.println("계산 기록 : " + intQueue); // 디버깅 출력
    }

    public static void removeResult() {
        intQueue.remove(); //Queue를 이용해 만든 배열의 첫항을 삭제하기 위한 메서드
    }

    public static void removeCircleResult() {
        circleQueue.remove(); //Queue를 이용해 만든 배열의 첫항을 삭제하기 위한 메서드
    }

    public static void inquiryResult() {
        for (Integer result : intQueue) {
            System.out.println(result); //inquiry 진행을 위한 메서드
        }
    }

    public static void inquiryCircleResult() {
        for (Double circleResult : circleQueue) {
            System.out.println(circleResult); //inquiry 진행을 위한 메서드
        }
    }

    public void calculateCircleArea(double num3) {
        double circleResult = num3 * num3 * pie; //원넓이 구하는 메서드
        circleQueue.add(circleResult);
        System.out.println("계산된 원 넓이: " + circleResult);
    }
}

