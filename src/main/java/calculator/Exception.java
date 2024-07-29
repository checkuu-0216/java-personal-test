package calculator;

public class Exception extends Throwable {
    public Exception() {
        System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
    }
}
