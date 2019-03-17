package zhu;

public class Bank {

    int year;
    double savedMoney;
    private final double interestRate = 0.35;
    double interest;

    public double computeInterest() {

        interest = year * interestRate * savedMoney;
        return interest;
    }

}
