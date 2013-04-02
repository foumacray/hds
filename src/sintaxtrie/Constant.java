package sintaxtrie;

import sintaxtrie.Token;
import Types.Value;

public class Constant  extends Token {

    Value number;

    public Constant(Value number) {
        this.number = number;
    }

    
    public String toSring() {
       return evaluate().toString();
    }

    
    public Value evaluate() {
        return number;
    }
}
