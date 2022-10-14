public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido");

        IOperator ope = new AddOperator();
        Calculator calcu = new Calculator(ope);
        System.out.println(calcu.applyOperation(15,15));

        IOperator ope2 = new SubtractOperator();
        calcu.setCalcu(ope2);
        System.out.println(calcu.applyOperation(25,30));

        IOperator ope3 = new MultiplyOperator();
        calcu.setCalcu(ope3);
        System.out.println(calcu.applyOperation(15,15));

        IOperator ope4 = new DivisionOperator();
        calcu.setCalcu(ope4);
        System.out.println(calcu.applyOperation(15,15));
    }

}