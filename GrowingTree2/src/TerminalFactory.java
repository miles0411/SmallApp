 //Author: Steve Roehrig, for the MISM/MSIT Java course
 //Revised: 11/13/2011
 //This is a taken gift from the professor
import java.util.*;

/** Produces a terminal Node (either a Variable or a Const). */

public class TerminalFactory {
    private int numIndepVars;
    /** Sets the range of X-variables that this factory can supply.
    * @param n The number of independent variables. */
    TerminalFactory(int n) { numIndepVars = n; }
    /** Returns a randomly selected Variable or Const. The selection is uniform
    * over the range [X0, X1,...Xn, Const] */
    public Node getTerminal(Random rand) {
        Node n = null;
        int i = rand.nextInt(numIndepVars + 1);
        if (i < numIndepVars)
            n = new Variable(i);
        else
            n = new Const(rand.nextDouble());
        return n;
    }
    public int getNumIndepVars() { return numIndepVars; }
}
