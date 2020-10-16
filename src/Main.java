public class Main {
    public static void main(String[] args) {
        BankService cashback = new BankService();
        double result = cashback.calculate(1000, 1);
        System.out.println(result);

        BankService deposit = new BankService();
        double depositSum = deposit.calculate(1000, 3, 12);
        System.out.println(depositSum);
    }
}
