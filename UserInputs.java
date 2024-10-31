class UserInputs {


    public static String inputName() {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        System.out.println("Lige før body");
        var name = scanner.nextInt();
        System.out.println(name);
        scanner.close();
        return "bob";
    }

    public static int inputLanguage() {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        int language = scanner.nextInt();
        scanner.close();
        return language;
    }    
}
