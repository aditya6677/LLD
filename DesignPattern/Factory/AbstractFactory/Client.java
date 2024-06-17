package DesignPattern.Factory.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        Profession profession = AbstractFactoryProducer.getAbstractFactory(false).getProfession(ProfessionEnum.ENGINEER);
        profession.myProfession();
    }
}
