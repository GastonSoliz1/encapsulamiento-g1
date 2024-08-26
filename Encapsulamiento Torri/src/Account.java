public class Account {
    private int numberAccount;
    private double balanceAccount;

    public Account (int numberAccount, double balanceAccount){
        this.numberAccount = numberAccount;
        this.balanceAccount = balanceAccount;

    }

    public int getNumberAccount(){
        return this.numberAccount;
    }

   public double getBalanceAccount(){
        return this.balanceAccount;
   }

   public void setBalanceAccount(double balanceAccount){
        this.balanceAccount = this.balanceAccount + balanceAccount;
   }



}
