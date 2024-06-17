package DesignPattern.Factory.FactoryMethod;

public class Client {
    public static void main(String[] args) {
        Profession profession = ProfessionFactory.getProfessionn(ProfessionEnum.DOCTOR);
        profession.myProfession();
    }
}
