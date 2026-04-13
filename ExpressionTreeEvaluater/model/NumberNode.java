package model;

public class NumberNode extends TreeNode {

    public NumberNode(String value) {
        super(value);
    }

    @Override
    public double evaluate() {
        return Double.parseDouble(value); // type casting
    }
}