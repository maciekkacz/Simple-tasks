package thirdTask;

public class PaymentCalculator {
    public static double ZUS = 0.098; //ZUS
    public static double RENT_INSURANCE = 0.015; //ubezpieczenie rentowe
    public static double MEDICAL_INSURANCE_025 = 0.025; //ubezpieczenie chorobowe
    public static double MEDICAL_INSURANCE_078 = 0.078; // ubezpieczenie zdrowotne
    public static double TAX_PREPAYMENT = 0.066;

    public static double grossYearPayment(Employee employee) {
        double grossSalary = employee.getSalary();
        return grossSalary * 12;
    }

    public static double netYearPayment(Employee employee) {
        double grossSalary = employee.getSalary();
        double tax = (ZUS + RENT_INSURANCE + MEDICAL_INSURANCE_025 + MEDICAL_INSURANCE_025 + MEDICAL_INSURANCE_078 +
                TAX_PREPAYMENT);
        double totalTax = tax * grossSalary;
        double netSalary = grossSalary - totalTax;
        double netYearSalary = netSalary * 12;
        return netYearSalary;
    }




}
