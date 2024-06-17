package DesignPattern.Factory.AbstractFactory;

public class TraineeFactory extends AbstractFactory{

    @Override
    Profession getProfession(ProfessionEnum profession) {
        switch (profession) {
            case ENGINEER: {
                return new TraineeEngineer();
            }
            default : {
                return null;
            }
        }
    }
}
