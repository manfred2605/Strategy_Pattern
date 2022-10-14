public class DivisionOperator implements IOperator{
    @Override
    public double executeOperation(double num1, double num2) {

        if (num1 > num2) {
            return num1 / num2;
        }
        if (num2 > num1) {
            return num2 / num1;
        }
        return 1;
    }
}
