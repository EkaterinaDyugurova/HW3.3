public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println(Math.ceil(service.calculate(100000,36))); // срок в мес
        System.out.println();

        System.out.println(Math.ceil(service.calculate(800000,84)));
        System.out.println();

        System.out.println(Math.ceil(service.calculate(50000,12)));
        System.out.println();













    }
}
