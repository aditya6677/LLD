package Design.Strategy;

public class Client {
    public static void main(String[] args) {
        IPathCalculator pc = PathCalcFactory.createPathCalc("BIKE");
        pc.findPath("A", "B");
    }
}
