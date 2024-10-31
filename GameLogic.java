class GameLogic {

    public static void runGame() {
        //creating objects
        var players = new Player[2];
        var cup = new RaffleCup(2, 1, 6);
        int currentturn = 0;
        var field = new Field();
        boolean won = false;
        int winningAmount = 3000;

        Utility.printLanguages();
        field.setLanguage(UserInputs.inputLanguage());
        System.out.println(field.getDescription(field.getLanguage(), 0));
        for(int i = 0; i < players.length; i++) {
            System.out.println("Player" + (i+1) + ":");
            players[i] = new Player(UserInputs.inputName());
        }

        while(!(won)) {
            System.out.println("\n" + players[currentturn].getName() + ":");
            UserInputs.inputWait();
            cup.shakeDie();
            Utility.printDiceFaceValues(cup.getDiceValues());
            System.out.println(field.getDescription(field.getLanguage(), cup.getDieSum()));
            players[currentturn].updateAccountBalance(field.getFieldValue(cup.getDieSum()));
            System.out.println(players[currentturn].getName() + ": " + players[currentturn].getAccountBalance());
            if(Utility.checkWin(players[currentturn].getAccountBalance(), winningAmount)) {
                won = true;
            }
            currentturn = Utility.playerTurn(field.getTurn(cup.getDieSum()), players, currentturn);
        }
        System.out.println(players[currentturn].getName() + " won the game");




    
    }




}
