public class testSpeed {
    public static void main(String[] args) {
        var cup = new RaffleCup(2, 1, 6);
        var field = new Field();
        var player = new Player[1];
        player[0] = new Player("test");

        //Speed test (1 turn)
        long begin = System.nanoTime();

        cup.shakeDie();
        player[0].updateAccountBalance(field.getFieldValue(cup.getDieSum()));

        long end = System.nanoTime();
        long timeNano = end - begin;
        double timeMilli = timeNano/1e6;

        System.out.println("time for one turn to play out is: " + timeMilli + "ms");
    }
}
