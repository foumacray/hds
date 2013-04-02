package comun.valueNode;

import sintaxtrie.Token;
import sintaxtrie.Value;

public class Constant  implements Token {

    Value number;

    public Constant(Value number) {
        this.number = number;
    }

    @Override
    public Object evaluate() {
        return number.getObjeto();
    }

    @Override
    public String toSring() {
       return evaluate().toString();
    }
}
