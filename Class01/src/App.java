public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercise Calculator");

        Calculator.division(5, 2);
        Calculator.mutiplication(5, 5);
        Calculator.subtraction(10, 5);
        Calculator.sum(50, 50);

        System.out.println("Exercise Message");

        Message.getMessage(5);
        Message.getMessage(14);
        Message.getMessage(00);

        System.out.println("Exercise Lending ");

        Lending.calculator(1000, Lending.getThreePortion());
        Lending.calculator(2000, Lending.getTwoPortion());
    }
}
