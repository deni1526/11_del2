import java.util.Scanner;

class UserInputs {


    public static String inputName() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        var name = scanner.nextLine();
        System.out.println(name);
        scanner.close();
        return name;
    }

    public static int inputLanguage() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        var language = Integer.parseInt(scanner.nextLine());
        scanner.close();
        return language;
    }    
}
