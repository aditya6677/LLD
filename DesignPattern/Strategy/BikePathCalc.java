package DesignPattern.Strategy;

public class BikePathCalc implements IPathCalculator{
    @Override
    public void findPath(String to, String from) {
        System.out.println("Bike Path calculator");
    }
}
