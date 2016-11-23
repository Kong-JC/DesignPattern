package facade_pattern;

/**
 * Created by Kong on 2016/11/2.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
