package comun.valueNode;

import sintaxtrie.Node;
import sintaxtrie.Value;

public class Constant  implements Node {

    Value number;

    public Constant(Value number) {
        this.number = number;
    }

    @Override
    public Object evaluate() {
        return number.getObjeto();
    }
}
