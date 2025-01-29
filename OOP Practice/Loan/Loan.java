package Loan;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmmount;
    private java.util.Date loanDate;

    // default constructor
    public Loan() {
        this(2.5, 1, 1000);
    }
    // consructor with specified values
    public Loan(double annualInterestRate, int numberOfYears, int loanAmmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmmount = loanAmmount;
    }

    // Get annualInterestRate
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    // Get numberOfYears
    public int getNumberOfYears(){
        return numberOfYears;
    }
    // Get loanAmmount
    public double getLoanAmmount(){
        return loanAmmount;
    }
    // set annualInterestRate
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate =annualInterestRate;
    }
    // set number of years
    public void setNoOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }
    // set loan ammount
    public void setLoanAmmount(double loanAmmount){
        this.loanAmmount = loanAmmount;
    }

    // get monthly payments
    public double getMonthlyPayments(){
        double montlyInterestRate = annualInterestRate / 1200;
        double monthlyPayments =( loanAmmount *montlyInterestRate) / (1- (1 / Math.pow( 1 + montlyInterestRate, numberOfYears * 12 )));
        return monthlyPayments;
    }

    // find total payments
    public double getTotalPayments(){
        return getMonthlyPayments() * numberOfYears *12 ;
    }

    // get loan Date
    public java.util.Date getLoanDate(){
        return loanDate;
    }
}
