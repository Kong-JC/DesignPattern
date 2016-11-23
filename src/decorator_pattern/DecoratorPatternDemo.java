package decorator_pattern;

/**
 * Created by Kong on 2016/11/2.
 */
public class DecoratorPatternDemo {

    public static void main(String[] args){
        Circle circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

    }

}
