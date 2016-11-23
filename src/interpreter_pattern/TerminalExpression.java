package interpreter_pattern;

/**
 * Created by Kong on 2016/11/3.
 */
public class TerminalExpression implements Expression{

    private String content = null;

    public TerminalExpression(String content) {
        this.content = content;
    }

    @Override
    public boolean interpret(String content) {
        return this.content.contains(content);
    }

}
