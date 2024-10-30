class GameLogic {

    public static void runGame() {
        //creating objects
        var Players = new Player[2];
        var cup = new RaffleCup(2);
        int currentturn = 0;
        var Field = new Field();
        boolean won = false;

        Utility.printLanguages();
        Field.setLanguage(UserInputs.inputLanguage());
        System.out.println(Field.getDescription(Field.getLanguage(), 0));
        for(int i = 0; i < Players.length; i++) {
            Players[i] = new Player(UserInputs.inputName());
        }

        while(!(won)) {
            System.out.println(Players[currentturn] + ":");
            cup.shakeDie();

            currentturn = Utility.Playerturn(Field.getTurn(cup.getDieSum()), Players, currentturn);
        }



        //methods til spil
    }




}
