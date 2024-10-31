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
        if(this.balance+(update) < 0) {
            System.out.println("Transaction not complete");
        } else {
            this.balance += (update);
        }
        
    }
}
