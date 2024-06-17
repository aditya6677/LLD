package DesignPattern.Factory.FactoryMethod;

public class ProfessionFactory {

    public static Profession getProfessionn(ProfessionEnum professionEnum){
        Profession profession = null;
        switch (professionEnum){
            case DOCTOR -> {
                return new Doctor();
            }
            case ENGINEER -> {
                return new Engineer();
            }
            default -> {
                return null;
            }
        }
    }
}
