package mediator_pattern;

/**
 * Created by Kong on 2016/11/3.
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoot.sendMessage(this,message);
    }

}
