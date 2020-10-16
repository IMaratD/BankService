public class BankService {
    double calculate (double costs, int cashback) {
        double money = costs * cashback / 100.0;
        int limit = 3000;
        if (money > limit) {
            return limit;
        }
        return money;

    }

    double calculate (int sum, int percent, int monthsNum) {
        double deposit = sum * percent / 100 * monthsNum;
        return deposit;
    }
}
