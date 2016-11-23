package interpreter_pattern;

/**
 * Created by Kong on 2016/11/3.
 */
public class AndExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String content) {
        return expr1.interpret(content) && expr2.interpret(content);
    }

}
