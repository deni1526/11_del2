import java.util.Scanner;

class UserInputs {
    private static final Scanner scanner = new Scanner(System.in);

    public static String inputName() {
        scanner.useLocale(java.util.Locale.ENGLISH);
        var name = scanner.nextLine();  
        return name;
    }

    public static int inputLanguage() {
        scanner.useLocale(java.util.Locale.ENGLISH);
        int language = 4;
        while(!(language == 0 || language == 1)) {
            language = Integer.parseInt(scanner.nextLine());
            if(!(language == 0 || language == 1)) {
                System.out.println("Please enter a valid number");
            }
        }
        return language;
       
      
    }    

    public static void closeScanner() {
        scanner.close();
    }

    public static String inputWait() {
        scanner.useLocale(java.util.Locale.ENGLISH);
        var name = scanner.nextLine();  
        return "";
    }
}
