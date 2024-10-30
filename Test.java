class test {
    public static void main(String[] args) {
        var cup = new RaffleCup(2);
        var acc = new Account(1000);

        //General cash growth test
        for (int i = 0; i < 100; i++) {
            cup.shakeDie();
            cup.getDieSum();
            Field.getFieldValue();
            Player.getAccountBalance();
            if (i==10 || i==20 || i==30 || i==40 || i==50 || i==60 || i==70 || i==80 || i==90 || i==100) {
                System.out.println("Balance amount after " + i + " turns: " + Player.getAccountBalance());
            }
        }
        //No negative test
        int neg = 0;
        for (int i = 0; i < 1000; i++) {
            cup.shakeDie();
            cup.getDieSum();
            Field.getFieldValue();
            Player.getAccountBalance();
            if (Player.getAccountBalance() < 0) neg++;
            if (i == 1000) System.out.println("Number of times balance was negative during " + i + " turns: " + neg);
        }
        
        //Speed test (1 turn)
        long begin = System.nanoTime();

        cup.shakeDie();
        cup.getDieSum();
        Field.getFieldValue();
        Player.getAccountBalance();

        long end = System.nanoTime();
        long timeNano = begin - end;
        double timeMilli = timeNano/1e6;

        System.out.println("time for one turn to play out is: " + timeMilli + "ms");
    }
}