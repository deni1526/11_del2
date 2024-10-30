class Utility {
    

    public static void printLanguages() {
        String info = "Choose language" + System.lineSeparator() + "[0] = English" + System.lineSeparator() + "[1] = Dansk";
        System.out.println(info);
    }

    public static int Playerturn(int turns, Player Player[], int currentturn) {
        int playerturn = (currentturn + turns) % Player.length;
        return playerturn;
    }

    public static boolean checkWin(int balance, int wincon) {
        if(balance >= wincon) {
            return true;
        }
        return false;
    }
}
