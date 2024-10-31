public class testBalGrowth {
    public static void main(String[] args) {
        var cup = new RaffleCup(2, 1, 6);
        var field = new Field();
        var player = new Player[1];
        player[0] = new Player("test");

        //General cash growth test
        for (int i = 0; i < 101; i++) {
            cup.shakeDie();
            player[0].updateAccountBalance(field.getFieldValue(cup.getDieSum()));
            if (i==10 || i==20 || i==30 || i==40 || i==50 || i==60 || i==70 || i==80 || i==90 || i==100) {
                System.out.println("Balance amount after " + i + " turns: " + player[0].getAccountBalance());
            }
        }
    }
}