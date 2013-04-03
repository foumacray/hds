package ParsingShuntingYard;

import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stack;
    private int numberOfElements;

    public Stack() {
        stack = new ArrayList();
        numberOfElements = 0;
    }

    public void pushStack(String symbol) {
        stack.add(symbol);
        numberOfElements++;
    }

    public String popStack() {
        String symbol = "";
        if (numberOfElements > 0) {
            symbol = stack.get(numberOfElements - 1);
            stack.remove(numberOfElements - 1);
            numberOfElements--;
        }
        return symbol;
    }

    public String checkTop() {
        return stack.get(numberOfElements - 1);
    }
}
