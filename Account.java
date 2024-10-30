class Account {
      private int balance;
   
    public Account(int balance) {
        this.balance = balance;
    }
    
    public int getBalance() {
        return balance;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void updateBalance(int update) {
        this.balance += (update);
    }
}
