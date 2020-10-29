public class BankService {
    double calculate (double costs, int percent) {
        double cashback = costs * percent / 100.0;
        int limit = 3000;
        if (cashback > limit) {
            return limit;
        }
        return cashback;

    }

    double calculate (int sum, int percent, int monthsNum) {
        double deposit = sum * percent / 100 * monthsNum;
        return deposit;
    }
}
