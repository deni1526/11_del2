public class testBalance {
    public static void main(String[] args) {
        var cup = new RaffleCup(2, 1, 6);
        var field = new Field();
        var player = new Player[1];

        player[0] = new Player(UserInputs.inputName());

        var balance = 0;

        for (int i=0; i <100; i++) {
            cup.shakeDie();
            player[0].updateAccountBalance(field.getFieldValue(cup.getDieSum()));
            
            balance += player[0].getAccountBalance();
            System.out.println("Player balance : " + balance);
            if (balance < 0) {
                System.out.println("balance is less than 0");
                break;

                
            }
        }

        


    }
    
}
