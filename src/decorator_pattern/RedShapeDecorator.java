package decorator_pattern;

/**
 * Created by Kong on 2016/11/2.
 */
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRadBorder(decoratorShape);
    }


    public void setRadBorder(Shape radDecorator) {
        System.out.println("Border Color: Red");
    }

}
