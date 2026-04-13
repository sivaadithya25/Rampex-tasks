package model;

public class OperatorNode extends TreeNode {

    private Node left, right; // encapsulation

    public OperatorNode(String op, Node left, Node right) {
        super(op);
        this.left = left;
        this.right = right;
    }

    @Override
    public double evaluate() {
        double l = left.evaluate();
        double r = right.evaluate();

        switch (value) {
            case "+": return l + r;
            case "-": return l - r;
            case "*": return l * r;
            case "/":
                if (r == 0) throw new ArithmeticException("Divide by zero");
                return l / r;
        }
        throw new RuntimeException("Invalid operator");
    }
}