class test {
    public static void main(String[] args) {
        var cup = new RaffleCup(2);
        cup.createDie(2);
        var acc = new Account(1000);

        //General cash growth test
        for (int i = 0; i < 100; i++) {
            cup.shakeRaffle();
            cup.getSum();//placeholder
            //land paa felt og koer effekt (werwall ekstra tur ignoreres)
            //opdater account
            if (i==10 || i==20 || i==30 || i==40 || i==50 || i==60 || i==70 || i==80 || i==90 || i==100) {
                System.out.println("Balance amount after " + i + " turns: " + acc.balanceAmount);//acc.balanceAmount(placeholder)
            }
        }
        //No negative test
        int neg = 0;
        for (int i = 0; i < 1000; i++) {
            cup.shakeRaffle();
            cup.getSum();//placeholder
            //land paa felt og koer effekt (werwall ekstra tur ignoreres)
            //opdater account
            if (acc.balanceAmount < 0) neg++; //acc.balanceAmount(placeholder)
            if (i == 1000) System.out.println("Number of times balance was negative during " + i + " turns: " + neg);
        }
        
        //Speed test (1 turn)
        long begin = System.nanoTime();

        cup.shakeRaffle();
        cup.getSum();
        //land paa felt og koer effekt (werwall ekstra tur ignoreres)
        //opdater account

        long end = System.nanoTime();
        long timeNano = begin - end;
        double timeMilli = timeNano/1e6;

        System.out.println("time for one turn to play out is: " + timeMilli + "ms");
    }
}