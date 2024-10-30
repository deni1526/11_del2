class Player {
    private String name;
    private Account account;
    private int startBalance = 1000;

    public Player(String name) {
        this.name = name;
        this.account.setBalance(startBalance);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getAccountBalance() {
        return account.getBalance();
    }

}
