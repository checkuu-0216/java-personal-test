package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private int result;
    private double circleResult;

    public int getResult() {
        return result; //캡슐화된 result를 불러오는 메서드
    }

    public void setResult(int result) {
        this.result = result; //간접 수정을 위한 setter
    }

    public double getCircleResult() {
        return circleResult;
    }

    public void setCircleResult(double circleResult) {
        this.circleResult = circleResult;
    }

}

