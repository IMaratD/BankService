public class CashbackService {
    double calculate (double costs, int cashback) {
        double money = costs * cashback / 100.0;
        int limit = 3000;
        if (money > limit) {
            return limit;
        }
        return money;

    }
}
