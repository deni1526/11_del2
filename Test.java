class test {
    public static void main(String[] args) {
        var d1 = new Die(1, 6);
        var d2 = new Die(1, 6);
        var a1 = new Account(1000)

        //General cash growth test
        for (int i; i < 100; i++) {
            Rafflecup.shakeRaffle(d1, d2);
            aaa.getDiceSum(d1, d2);
            //land paa felt og koer effekt (werwall ekstra tur ignoreres)
            //opdater account
            if (i==10 || i==20 || i==30 || i==40 || i==50 || i==60 || i==70 || i==80 || i==90 || i==100) {
                System.out.println(a1.balance);
            }

        }
        //Speed test (1 turn)
        long begin = System.nanoTime();

        //Her skal en tur spilles ud
        RaffleCup.shakeRaffle(d1, d2);
        aaa.getDiceSum(d1, d2);

        long end = System.nanoTime();
        long timeNano = finish - start;
        double timeMilli = timeNano/1e6;

        System.out.println(timeMilli);
    }
}