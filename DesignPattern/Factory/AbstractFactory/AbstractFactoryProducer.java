package DesignPattern.Factory.AbstractFactory;

public class AbstractFactoryProducer {
    public static AbstractFactory getAbstractFactory(Boolean isTrainee){
        if(isTrainee){
            return new TraineeFactory();
        }
        else {
            return new NonTraineeFactory();
        }
    }
}
