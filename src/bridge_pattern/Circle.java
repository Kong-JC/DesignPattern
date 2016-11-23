package bridge_pattern;

/**
 * Created by Kong on 2016/11/1.
 */
public class Circle extends Shape {

    private int x, y, radius;

    /**
     * 因为Circle继承了Shape，而Shape的构造方法中声明了drawAPI对象，并在构造方法传递一个DrawAPI对象进来
     * 所以这里等于是，你传递什么对象进来，这里就调用哪个对象的drawCircle方法
     *
     * @param drawAPI
     * @param x
     * @param y
     * @param radius
     */
    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }

}
