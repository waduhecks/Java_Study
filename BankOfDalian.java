package zhu;

public class BankOfDalian extends Bank{

    double year;

    @Override
    public double computeInterest() {

        super.year = (int)year;
        double day_in_year = year - (int)year;
        int day = (int)(day_in_year * 1000);
        interest = super.computeInterest() + day * 0.00012 * savedMoney;

        System.out.println("在大连银行存钱为: " + savedMoney + "元" + " 利息为:" + interest + "元");
        return interest;
    }
}
