package memento_pattern;

/**
 * Created by Kong on 2016/11/3.
 */
public class MementopatternDemo {

    public static void main(String[] args){

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #0");
        originator.setState("State #1");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        originator.setState("State #4");
        originator.setState("State #5");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #6");
        originator.setState("State #7");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #8");
        originator.setState("State #9");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(2));
        System.out.println("Thirdly saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(3));
        System.out.println("Fourthly saved State: " + originator.getState());

    }

}
