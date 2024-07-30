package calculator;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int count = 0; //카운트 세기위한 index

        System.out.println("1.사칙연산 2.원의 넓이 진행할 계산기의 번호를 입력해 주세요");
        String text4 = sc.next();
        if (text4.equals("1")) {
            while (true) { //결과값을 배열에 넣기위해 while에서 for문으로 바꿈
                ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt(); //입력된 숫자를 저장하기 위한 nextInt
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();
                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0); //사칙연산 기호를 넣기 위한 메소드
                // charAt 매개변수로 char 타입으로 변환 하고자하는 문자열의 위치를 받는다

                try {
                    arithmeticCalculator.calculate(operator, num1, num2);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                System.out.println("결과: " + arithmeticCalculator.getResult());//캡슐화 후 getter 메서드 사용
                count++;
                System.out.println(count + "번 계산하였습니다."); //while이 돌아간 수를 세기 위함

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String text = sc.next();//첫항 삭제를 위한 텍스트 입력 구간
                if (text.equals("remove")) {
                    ArithmeticCalculator.removeResult();
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String text2 = sc.next();
                if (text2.equals("inquiry")) {
                    ArithmeticCalculator.inquiryResult();
                }

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                String text3 = sc.next(); //계산종료 확인을 위한 텍스트 입력 구간
                if (text3.equals("exit")) {
                    System.exit(0); // 강의 2주차 숙제를 통해 특정 문자를 사용했을때 종료되는 법 배움
                }
            }
        } else if (text4.equals("2")) {
            while (true) {
                CircleCalculator circleCalculator = new CircleCalculator();
                System.out.print("원의 반지름을 입력하세요: ");
                double num3 = sc.nextDouble();
                circleCalculator.calculateCircleArea(num3);//원 넓이 구하기 공식 넣기

                count++;
                System.out.println(count + "번 계산하였습니다."); //while이 돌아간 수를 세기 위함

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String text = sc.next();//첫항 삭제를 위한 텍스트 입력 구간
                if (text.equals("remove")) {
                    CircleCalculator.removeCircleResult();
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String text2 = sc.next();
                if (text2.equals("inquiry")) {
                    CircleCalculator.inquiryCircleResult();
                }

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                String text3 = sc.next(); //계산종료 확인을 위한 텍스트 입력 구간
                if (text3.equals("exit")) {
                    System.exit(0);
                }
            }
        }
    }
}

