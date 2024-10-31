import java.util.Scanner;

class UserInputs {
    private static final Scanner scanner = new Scanner(System.in);

    public static String inputName() {
        scanner.useLocale(java.util.Locale.ENGLISH);
        var name = scanner.nextLine();  
        System.out.println(name);
        return name;
    }

    public static int inputLanguage() {
        scanner.useLocale(java.util.Locale.ENGLISH);
        int language = Integer.parseInt(scanner.nextLine());
        return language;
    }    

    public static void closeScanner() {
        scanner.close();
    }
}
