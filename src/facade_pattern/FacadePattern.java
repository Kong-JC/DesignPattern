package facade_pattern;

/**
 * Created by Kong on 2016/11/2.
 */
public class FacadePattern {

    public static void main(String[] args){

        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircrl();
        shapeMaker.drawSquare();
        shapeMaker.drawRectangle();

    }

}
