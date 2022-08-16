package QLTHENGANHANG;

public class main {
    public static void main(String[] args) {
        Account account = new Account();
        account.name("phạm quang vinh");
        account.accountNumber(1022537089);
        account.accountBalance(130243.340);
        account.email("phamquanvinh@gmail.com");
       
        account.recharge(150000);
        System.out.println("\n");



        Account account2 = new Account();
        account2.name("vu van dung");
        account2.accountNumber(102284394);
        account2.accountBalance(1364.340);
        account2.email("phamvantien@gmail.com");
        account2.changeEmail("vdung5673@gmail.com");
        


    }

}
