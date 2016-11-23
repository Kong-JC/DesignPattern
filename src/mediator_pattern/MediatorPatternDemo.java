package mediator_pattern;

/**
 * Created by Kong on 2016/11/3.
 */
public class MediatorPatternDemo {

    public static void main(String[] args){
        User user1 = new User("user1");
        User user2 = new User("user2");

        user1.sendMessage("I am User1");
        user2.sendMessage("I am User2");

    }

}
