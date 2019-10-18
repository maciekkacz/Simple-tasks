package thirdTask;

public class PaymentTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Maciej", "Kaczmarczyk", 5000);
        double netYearPayment = PaymentCalculator.netYearPayment(employee);
        double grossYearPayment = PaymentCalculator.grossYearPayment(employee);
        System.out.println(netYearPayment);
        System.out.println(grossYearPayment);
    }
}
