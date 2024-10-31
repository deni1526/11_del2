import java.util.Scanner;

class UserInputs {


    public static String inputName() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        System.out.println("Lige før body");
        var name = scanner.nextInt();
        System.out.println(name);
        scanner.close();
        return "bob";
    }

    public static int inputLanguage() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        int language = scanner.nextInt();
        scanner.close();
        return language;
    }    
}
