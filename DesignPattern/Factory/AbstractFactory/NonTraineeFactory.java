package DesignPattern.Factory.AbstractFactory;

public class NonTraineeFactory extends AbstractFactory {
    @Override
    Profession getProfession(ProfessionEnum professionEnum) {
        switch (professionEnum) {
            case ENGINEER -> {
                return new Engineer();
            }
            default -> {
                return null;
            }
        }
    }
}
