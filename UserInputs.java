class UserInputs {


    public static String inputName() {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        String name = scanner.nextLine();
        scanner.close();
        return name;
    }

    public static int inputLanguage() {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        int language = scanner.nextInt();
        scanner.close();
        return language;
    }    
}
