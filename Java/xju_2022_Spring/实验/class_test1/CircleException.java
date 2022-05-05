package class_test1;

public class CircleException extends Exception {
    String mess;
    public CircleException() {
        mess="圆半径小于0异常";
    }

    public CircleException(double r) {
        mess="圆半径" + r + "小于0异常";
    }

    public String toString() {
        return mess;
    }
}