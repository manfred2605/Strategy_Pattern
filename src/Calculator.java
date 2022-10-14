import java.util.*;

public class Calculator {
    public IOperator getCalcu() {
        return calcu;
    }

    public void setCalcu(IOperator calcu) {
        this.calcu = calcu;
    }

    public Calculator() {
    }

    private IOperator calcu;

    public Calculator(IOperator calcu) {
        this.calcu = calcu;
    }

    public double applyOperation(double numA, double numB) {
        return calcu.executeOperation(numA, numB);
    }
}
