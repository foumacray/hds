package sintaxtrie.nodes;

import sintaxtrie.nodes.valueTypes.Value;

public abstract class Token {

    public abstract Value evaluate();

    public abstract String toSring();
}
