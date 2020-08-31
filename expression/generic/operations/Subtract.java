package expression.generic.operations;


public class Subtract<T extends Number> extends AbstractArithmetic<T> {
    public Subtract(CommonExpression<T> leftOperand, CommonExpression<T> rightOperand, Calculation<T> op) {
        super(leftOperand, rightOperand, op);
    }

    @Override
    protected T calculateOperation(T leftOperand, T rightOperand)  {
        return op.subtract(leftOperand, rightOperand);
    }

}
