import java.sql.SQLOutput;
import java.util.Scanner;

public class NewLogin {

    public static String userId;
    public static String userPass;
    public static int i;

/// Method 1 --- for saving the new registration user login details....
    public static void accountDataSave(String userEmail, String userPassword){

// Saving the new user login details
        userId = userEmail;
        userPass = userPassword;

    }

    ///Method 2 --- For cheaking the login user id and passoword correct or not...
    public static void loginUser() {
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("\nLogin to your Account, ");

            System.out.print("\tEnter your Email: ");
            String userInputId = sc.nextLine();

            System.out.print("\tEnter your Password: ");
            String userInputPassword = sc.nextLine();

            // cheaking user id correct or not

            if (userInputId.equals(userId)) {
                if (userInputPassword.equals(userPass)) {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tLogin as: " + userInputId.substring(0, userInputId.indexOf('@')));
                    i++;
                } else {
                    System.out.println("\nWrong password entered!");
                }
            } else {
                System.out.println("Either, User id  or Password was wrong.");
                System.out.println("Re-enter your login detail...");
                continue;
            }

        } while (i == 0);


        // After sucessfully login, providing user application features....

        System.out.println("Options: ");
        System.out.println("\n\t1. MOVIES\n" +
                "\t2. BOOKING");
        System.out.print("Enter your choice(1-2): ");
        int userInput = sc.nextInt();


            switch (userInput) {
                case 1:
                    System.out.println("\t1. NOW SHOWING\n" +
                            "\t2. NEXT RELEASE\n" +
                            "\t3. UPCOMING MOVIES");

                    System.out.print("Enter your choice(1-3): ");
                    int userChoice = sc.nextInt();

                    // Calling Class - movieSection - method
                    MovieSection movieSection = new MovieSection();
                    movieSection.movieSectionDetail(userChoice);
                    break;

                case 2:
                    // Calling Class - bookingMovie
                    BookingSection bookingSection = new BookingSection();
                    bookingSection.bookingMovie();
                    break;

                default:
                    System.out.println("WRONG INPUT!!");
                    break;

            }
    }

    }