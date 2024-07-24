package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt(); //입력된 숫자를 저장하기 위한 nextInt
        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.next().charAt(0); //사칙연산 기호를 넣기 위한 메소드
        // charAt 매개변수로 char 타입으로 변환 하고자하는 문자열의 위치를 받는다
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        int result = 0;
        switch (operator) {

            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // 나눗셈 연산에서 분모가 0일 경우를 위한 if 문
                if(num2 ==0){
                    System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                }else{
                result = num1 / num2;}
                break;
            default:
                System.out.println("사칙 연산외에 다른 기호가 들어갈 수 없습니다.");
                //사칙연산의 switch인데 다른문자가 들어 갔을 경우를 위해 작성
        }
        System.out.println("결과: " + result);
    }
}