 //Author: Steve Roehrig, for the MISM/MSIT Java course
 //Revised: 11/13/2011
 //This is a taken gift from the professor


/** Implements "restricted division": if the divisor is within 0.0001
* of zero, numericalEval() returns 1.0.
*/
public class Divide extends Binop {
    public Divide() {}
    public Divide(Node l, Node r) {
        super(l, r);
    }
    public double eval(double[] data) {
        if (Math.abs(rChild.eval(data)) < 0.0001)
            return 1;
        else
        	return lChild.eval(data) / rChild.eval(data);
    }
    public String toString() {
        String s = new String();
        s += "(" + lChild.toString() + " / " + rChild.toString() + ")";
        return s;
    }
    public Node duplicate() {
        Divide alterEgo = new Divide();
        alterEgo.lChild = lChild.duplicate();
        alterEgo.rChild = rChild.duplicate();
        return alterEgo;
    }
}
