public class Main {
    public static void main(String[] args) {
        CashbackService cashback = new CashbackService();
        double result = cashback.calculate(1000, 1);
        System.out.println(result);

        DepositService deposit = new DepositService();
        double depositSum = deposit.calculate(1000, 3, 12);
        System.out.println(depositSum);
    }
}
