package DesignPattern.Strategy;

public class PathCalcFactory {
    public static IPathCalculator createPathCalc(String mode) {
        return switch (mode) {
            case "BIKE" -> new BikePathCalc();
            default -> new CarPathCalc();
        };
    }
}
