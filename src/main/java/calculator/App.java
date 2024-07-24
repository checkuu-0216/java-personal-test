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

    }
}