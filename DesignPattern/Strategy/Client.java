package DesignPattern.Strategy;

public class Client {
    public static void main(String[] args) {
        IPathCalculator pc = PathCalcFactory.createPathCalc("BIKE");
        pc.findPath("A", "B");

        String b = null;
        Integer a = Integer.valueOf(b);
        System.out.println(a);
    }
}
