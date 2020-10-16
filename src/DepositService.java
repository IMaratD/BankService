public class DepositService {
    double calculate (int sum, int percent, int monthsNum) {
        double deposit = sum * percent / 100 * monthsNum;
        return deposit;
    }
}
