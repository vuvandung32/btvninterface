package QLTHENGANHANG;

public class Account implements IAccount {
    private String name;
    private int accountNumber;
    private String email;
    private Double accountBalance;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Account name(String name) {
        setName(name);
        return this;
    }

    public Account accountNumber(int accountNumber) {
        setAccountNumber(accountNumber);
        return this;
    }

    public Account email(String email) {
        setEmail(email);
        return this;
    }

    public Account accountBalance(Double accountBalance) {
        setAccountBalance(accountBalance);
        return this;
    }

    @Override
    public void recharge(double amount) {
        // TODO Auto-generated method stub
        System.out.println("Số tiền nạp vào : " + amount);

        setAccountBalance(amount + getAccountBalance());

        displayinfo();

    }

    @Override
    public void changeEmail(String Email) {
        // TODO Auto-generated method stub

        System.out.println("emai ban đầu : "+email+"\nemai của bạn sau khi đổi : " + Email);
        setEmail(Email);
        displayinfo();
    }

    @Override
    public void displayinfo() {
        // TODO Auto-generated method stub
        System.out.println("tên là : " + getName());
        System.out.println("số tài khoản : " + getAccountNumber());
        System.out.println("số dư là :  " + getAccountBalance());

    }

}
