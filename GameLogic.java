class GameLogic {

    public static void runGame() {
        //creating objects
        var Players = new Player[2];
        var cup = new RaffleCup(2);
        int currentturn = 0;

        Utility.printLanguages();
        Field.setLanguage(UserInputs.inputLanguage());
        System.out.println(Field.getDescription(Field.getLanguage(), 0));
        for(int i = 0; i < Players.length; i++) {
            Players[i] = new Player(UserInputs.inputName());
        }

        for(int i = 0; i < 3000; i++) {
            Players[currentturn]

            currentturn = Playerturn(getTurn(getDieSum), )
        }



        //methods til spil
    }




}
