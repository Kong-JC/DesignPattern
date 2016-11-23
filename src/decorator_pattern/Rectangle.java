package decorator_pattern;

/**
 * Created by Kong on 2016/11/2.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
