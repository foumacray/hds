package sintaxtrie;

import Types.Value;

public abstract class Token {
   
     public abstract Value evaluate();
     public abstract String toSring();
}
