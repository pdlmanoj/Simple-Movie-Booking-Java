import java.util.Scanner;

public class Main {

    public static String[] strings = new String[100];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Displaying the Cinema hall name

        System.out.println("\t----------------------------------------------");
        System.out.println("\t\t\t\t\tIIMS-Cinema Hall");
        System.out.println("\t\t\t\t\tDhobidhara, Kathmandu");
        System.out.println("\t----------------------------------------------\n");

        // Asking new user for there registration....
        System.out.println("REGISTER YOUR ACCOUNT");

        System.out.print("\tEnter your email-account: ");
        strings [0] = sc.nextLine();

        System.out.print("\tChoose strong password: ");
        strings [1] = sc.nextLine();

        System.out.println("\n\t\tSuccessfully, created your account.\n");

        // passing arrary to accountDataSave method....
         NewLogin newLogin = new NewLogin();
         newLogin.accountDataSave(strings[0], strings[1]);

         // calling login pannel... after registration of new user..
         newLogin.loginUser();

    }






}

