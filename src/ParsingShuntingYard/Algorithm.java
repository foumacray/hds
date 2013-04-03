package ParsingShuntingYard;

public class Algorithm {

    private Stack numberStack = new Stack();
    private Stack operatorStack = new Stack();
    private Stack entryStack = new Stack();
    private String stringLine;
    private String numberAlphabet = "0123456789";

    public Algorithm(String stringLine) {
        for (int i = stringLine.length() - 1; i >= 0; i--) {
            entryStack.pushStack(stringLine.substring(i, i + 1));
        }
    }

    public boolean pickOne() {
        if (numberAlphabet.indexOf(entryStack.checkTop()) != -1) {
            numberStack.pushStack(entryStack.popStack());
            return true;
        }
        if (numberAlphabet.indexOf(entryStack.checkTop()) == -1) {
            operatorStack.pushStack(entryStack.popStack());
            return true;
        }
        return false;
    }

    public Stack getEntryStack() {
        return entryStack;
    }
}
