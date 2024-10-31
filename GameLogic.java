class GameLogic {

    public static void runGame() {
        //creating objects
        var Players = new Player[2];
        var cup = new RaffleCup(2);
        int currentturn = 0;
        var Field = new Field();
        boolean won = false;
        int winningAmount = 3000;

        Utility.printLanguages();
        Field.setLanguage(UserInputs.inputLanguage());
        System.out.println(Field.getDescription(Field.getLanguage(), 0));
        for(int i = 0; i < Players.length; i++) {
            System.out.println("Player" + (i+1) + ":");
            Players[i] = new Player(UserInputs.inputName());
        }

        while(!(won)) {
            System.out.println(Players[currentturn].getName() + ":");
            cup.shakeDie();
            Utility.printDiceFaceValues(cup.getDiceValues());
            System.out.println(Field.getDescription(Field.getLanguage(), cup.getDieSum()));
            Players[currentturn].updateAccountBalance(Field.getFieldValue(cup.getDieSum()));
            System.out.println(Players[currentturn] + ": " + Players[currentturn].getAccountBalance());
            if(Utility.checkWin(Players[currentturn].getAccountBalance(), winningAmount)) {
                won = true;
            }
            currentturn = Utility.playerTurn(Field.getTurn(cup.getDieSum()), Players, currentturn);
        }




        //methods til spil
    }




}
