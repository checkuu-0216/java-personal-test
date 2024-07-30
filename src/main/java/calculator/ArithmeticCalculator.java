package calculator;

import java.util.Queue;
import java.util.LinkedList;

public class ArithmeticCalculator extends Calculator {
    static Queue<Integer> intQueue = new LinkedList<Integer>();
    //각각 클래스를 만들어 식을 옮겼고 여기에 새로 생성했다
    private AddOperator addOperator = new AddOperator();
    private SubtractOperator subtractOperator = new SubtractOperator();
    private MultiplyOperator multiplyOperator = new MultiplyOperator();
    private DivideOperator divideOperator = new DivideOperator();
    private ModOperator modOperator = new ModOperator();

    public ArithmeticCalculator() {
        super();
    }
    public void calculate(char operator, int num1, int num2) throws Exception {
        int result =0;
        switch (operator) {
            case '+':
               result = addOperator.add(num1, num2);
                break;
            case '-':
                result = subtractOperator.sub(num1, num2);
                break;
            case '*':
               result = multiplyOperator.mul(num1, num2);
                break;
            case '/':
                if(num2 ==0){
                    throw new Exception();
                } else
               result = divideOperator.div(num1, num2);
                break;
            case '%':
                result = modOperator.mod(num1,num2); //나눈 나머지 계산식 추가
            default:
                System.out.println(" + , - , * , / , % 외에 다른 기호가 들어갈 수 없습니다.");
        }
        setResult(result);
        intQueue.add(result);
        System.out.println("계산 기록 : " + intQueue); // 디버깅 출력
    }

    public static void removeResult() {
        intQueue.remove(); // Queue를 이용해 만든 배열의 첫 항을 삭제하기 위한 메서드
    }

    public static void inquiryResult() {
        for (Integer result : intQueue) {
            System.out.println(result); //inquiry 진행을 위한 메서드
        }
    }
}
