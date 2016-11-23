package memento_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kong on 2016/11/3.
 */
public class CareTaker {

    public List<Memento> mMementoList = new ArrayList<>();

    public void add(Memento memento){
        mMementoList.add(memento);
    }

    public Memento get(int index){
        return mMementoList.get(index);
    }

}
