class Utility {
    

    public static void printLanguages() {
        String info = "Choose language" + System.lineSeparator() + "[0] = English" + System.lineSeparator() + "[1] = Dansk";
        System.out.println(info);
    }

    public static int playerTurn(int turns, Player[] player, int currentturn) {
        int playerturn = (currentturn + turns) % player.length;
        return playerturn;
    }

    public static boolean checkWin(int balance, int wincon) {
        if(balance >= wincon) {
            return true;
        }
        return false;
    }

    public static void printDiceFaceValues(int[] dices) {
        for (int i = 0; i < dices.length ; i++) {
            System.out.print("Dice " + (i+1) + ": " + dices[i]);

            if (!(i == (dices.length-1))) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
