package Loan;

public class TestLoan {
    public static void main(String[] args) {
        Loan loan = new Loan(2.5, 5, 1000);

        System.out.println(loan.getLoanDate());
        System.out.println(loan.getMonthlyPayments());
        System.out.println(loan.getTotalPayments());
    }
}
