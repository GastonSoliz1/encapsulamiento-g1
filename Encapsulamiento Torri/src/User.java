public class User {
    private String username;
    private String pass;
    private Account account;

    public User(String username, String pass, int number) {
        this.username = username;
        this.pass = pass;
        this.account = new Account(number,0);
    }

    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;

    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public double getBalance() {
        return this.account.getBalanceAccount();
    }

    public void setBalance(double balance) {
        this.account.setBalanceAccount(balance);
    }

    public int getNumberAccount(){
        return this.account.getNumberAccount();
    }

}


