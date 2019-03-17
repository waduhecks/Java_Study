package zhu;

public class test1 {

    public static void main(String[] args) {

        int money = 8000;

        ConstructionBank constructionBank = new ConstructionBank();
        constructionBank.savedMoney = money;
        constructionBank.year = 5.236;
        double interest1 = constructionBank.computeInterest();

        BankOfDalian  bankOfDalian= new BankOfDalian();
        bankOfDalian.savedMoney = money;
        bankOfDalian.year = 5.236;
        double interest2 = bankOfDalian.computeInterest();

        System.out.printf("两个银行的利息差为%.2f元\n", interest1 - interest2);
    }
}
