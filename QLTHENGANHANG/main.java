package QLTHENGANHANG;

public class main {
    public static void main(String[] args) {
        Account account = new Account();
        account.name("vu van dung");
        account.accountNumber(1022537089);
        account.accountBalance(130243.340);
        account.email("helo@gmail.com");
       
        account.recharge(150000);
        account.changeEmail("vdung57673@gami.com");
        account.displayinfo();
        


    }

}
