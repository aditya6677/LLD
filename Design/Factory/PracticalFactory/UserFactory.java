package Design.Factory.PracticalFactory;

public class UserFactory {

    public static User getUser(String type){
        if(type.equalsIgnoreCase("student")){
            return new Student();
        }
        else if(type.equalsIgnoreCase("ta")){
            return new TA();
        }
        else{
            return new User();
        }
    }
}
