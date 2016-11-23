package mediator_pattern;

import java.util.Date;

/**
 * Created by Kong on 2016/11/3.
 */
public class ChatRoot {

    public static void sendMessage(User user, String message) {
        System.out.println(new Date().toString() + "[" + user.getName() + "] :" + message);
    }

}
