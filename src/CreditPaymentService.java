public class CreditPaymentService {
    public double calculate(int sum, int term) {
        double percent = 9.9 / (100 * 9.9);
        term = -term;
        double percentMonth = Math.pow(1 + percent, term);
        double index = 1 - percentMonth;
        double index2 = percent / index;
        double payment = sum * index2;
        return payment;


    }
}
