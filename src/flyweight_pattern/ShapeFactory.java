package flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kong on 2016/11/2.
 */
public class ShapeFactory {

    private static Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

}
