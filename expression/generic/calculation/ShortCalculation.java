package expression.generic.calculation;

import expression.generic.exceptions.DivisionByZeroException;
import expression.generic.exceptions.ParsingException;
import expression.generic.operations.Calculation;

public class ShortCalculation implements Calculation<Short> {

    @Override
    public Short add(Short a, Short b) {
        return (short) (a + b);
    }

    @Override
    public Short multiply(Short a, Short b) {
        return (short) (a * b);
    }

    @Override
    public Short negate(Short a) {
        return (short)(-1 * a);
    }

    @Override
    public Short divide(Short a, Short b) {
        if (b == 0) {
            throw new DivisionByZeroException("DVZ in Short");
        }
        return (short) (a / b);
    }

    @Override
    public Short subtract(Short a, Short b) {
        return (short)(a - b);
    }

    @Override
    public Short transform(String s) {
        return Short.parseShort(s);
    }

    @Override
    public Short cast(Number a) {
        return a.shortValue();
    }

    @Override
    public Short max(Short a, Short b) {
        return a > b ? a : b;
    }

    @Override
    public Short min(Short a, Short b) {
        return a < b ? a : b;
    }

    @Override
    public Short count(Short a) {
        short tmp = a;
        short cnt = 0;
        for (int i = 0; i < 16; i++) {
            cnt += Math.abs(tmp % 2);
            tmp = (short) (tmp >> 1);
        }
        return cnt;
    }
}
