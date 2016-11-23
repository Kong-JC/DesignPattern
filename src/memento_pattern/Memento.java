package memento_pattern;

/**
 * Created by Kong on 2016/11/3.
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState(){
        return state;
    }

}
