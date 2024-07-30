package calculator;
import java.util.Queue;
import java.util.LinkedList;

public class CircleCalculator extends Calculator{
    private static Queue<Double> circleQueue = new LinkedList<>();
    private double circleResult;
    private final double pie = 3.1415; //final로 한 이는 pie의 값은 변하지 않는 값이고 해당 값이 변경되는것을 막기위해 final을 썻다.

    public CircleCalculator() {
        super();
    }

    public double calculateCircleArea(double num3) {
        double circleResult = num3 * num3 * pie; //원넓이 구하는 메서드
        setCircleResult(circleResult);
        circleQueue.add(circleResult);
        System.out.println("계산된 원 넓이: " + circleResult);
        return circleResult;
    }

    public static void removeCircleResult() {
        circleQueue.remove(); //Queue를 이용해 만든 배열의 첫항을 삭제하기 위한 메서드
    }
    public static void inquiryCircleResult() {
        for (Double circleResult : circleQueue) {
            System.out.println(circleResult); //inquiry 진행을 위한 메서드
        }
    }
}
