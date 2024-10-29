class GameLogic {

    public static void runGame() {
        var Players = new Player[2];
        var cup = new RaffleCup();
        cup.createDie(2);

        Utility.printLanguages();
        //Field.Description giver info
        Players[0] = new Player(UI.inputName());
        Players[1] = new Player(UI.inputName());



        //methods til spil
    }




}
