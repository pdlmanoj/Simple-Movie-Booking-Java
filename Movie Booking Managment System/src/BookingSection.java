import java.util.Scanner;

public class BookingSection {

    // Creating remaining array fields.....

    public static String[] availablescreens = {"Audi 1", "Audi 2", "Audi 3"};

    public static String[] availablebookingdays = {"Today", "Tomorrow"};

    public static String[] availableshowtimesmovie1 = {"7:00 am", "9:00 am", "11:00 am", "2:00 pm", "6:00pm"};
    public static String[] availableshowtimesmovie2 = {"8:00 am", "10:00 am", "1:00 am", "3:00 pm", "11:00pm"};
    public static String[] availableshowtimesmovie3 = {"6:00 am", "11:00 am", "2:00 am", "5:00 pm", "8:00pm"};

    public static String[] availableseatmovie1 = {"A1", "A2", "B1", "B2", "C1", "C2", "C3", "D1", "D2", "D6", "F1", "F2", "H2", "H5", "H6", "H9", "J1", "J5", "J7", "J9"};
    public static String[] availableseatmovie2 = {"A1", "A3", "B6", "B8", "C11", "C6", "C7", "D2", "D5", "D8", "F3", "F11", "H1", "H4", "H9", "H11", "J3", "J2", "J7", "J8"};
    public static String[] availableseatmovie3 = {"A2", "A6", "B9", "B12", "C1", "C5", "C8", "D2", "D5", "D7", "F6", "F2", "H3", "H4", "H5", "H8", "J1", "J5", "J6", "J4"};


    public static int userTotalChooseSeat;
    public static double ticketPrice = 150;

    // Accessing movieNames by calling MovieSection class
    public static MovieSection movieSection = new MovieSection();

    // Accessing userTicketDisplay by calling TicketDisplay class
    public static TicketDisplay ticketDisplay = new TicketDisplay();

    // Creating a fields for displaying ticket detail to user (after that, passing to TicketDisplay class - userTicketDisplay method)
    public static String movieName;
    public static String movieScreen;
    public static String movieDay;
    public static String movieTime;
    public static String movieSeat;
    public static double movieCost;


    // When user choose, Booking option executing the program....
    public static void bookingMovie() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\tNOW SHOWING ");


        System.out.println("\t 1. " + movieSection.movieNames[0] + ":\t" + movieSection.movieHours[0]);
        System.out.println("\t 2. " + movieSection.movieNames[1] + ":\t" + movieSection.movieHours[1]);
        System.out.println("\t 3. " + movieSection.movieNames[2] + ":\t" + movieSection.movieHours[2]);

        System.out.println("Enter your Choice (1-3): ");
        int userMovieChoice = sc.nextInt();

        // To display Ticket Details
        movieName = movieSection.movieNames[userMovieChoice - 1];

        if (userMovieChoice == 1 || userMovieChoice == 2 || userMovieChoice == 3) {
            System.out.println("SCREEN:\n" +
                    "\t1. " + availablescreens[0] + "\n" +
                    "\t2. " + availablescreens[1] + "\n" +
                    "\t3. " + availablescreens[2]);
            System.out.print("Your Choice (1-3): ");
            int userScreenChoice = sc.nextInt();

            // For Display Ticket Details
            movieScreen = availablescreens[userScreenChoice - 1];

        } else {
            System.out.println("WRONG CHOICE!!");
        }

        System.out.println("\nWHICH DAY? \n" +
                "\t1. " + availablebookingdays[0] + "\n" +
                "\t2. " + availablebookingdays[1]);

        System.out.print("Your Choice (1 or 2): ");
        int userDayChoice = sc.nextInt();

        // To display Ticket Details
        movieDay = availablebookingdays[userDayChoice - 1];

        userMovieTime(userMovieChoice);

        userSeatChoice(userMovieChoice);

    }

// Displaying Showtime as per user - movie choice....

    public static void userMovieTime(int userChoice) {
        Scanner sc = new Scanner(System.in);
        int userTimeChoice;

        // If user choice movie 1

        if (movieSection.movieNames[userChoice - 1].equals(movieSection.movieNames[0])) {
            System.out.println("SHOW TIME:  \n" +
                    "\t1. " + availableshowtimesmovie1[0] + "\n" +
                    "\t2. " + availableshowtimesmovie1[1] + "\n" +
                    "\t3. " + availableshowtimesmovie1[2] + "\n" +
                    "\t4. " + availableshowtimesmovie1[3] + "\n" +
                    "\t5. " + availableshowtimesmovie1[4]);

            System.out.print("Your Choice (1-5): ");
            userTimeChoice = sc.nextInt();

//            For displaying Ticket
            movieTime = availableshowtimesmovie1[userTimeChoice - 1];

            // If user choice movie 2

        } else if (movieSection.movieNames[userChoice - 1].equals(movieSection.movieNames[1])) {
            System.out.println("SHOW TIME:  \n" +
                    "\t1. " + availableshowtimesmovie2[0] + "\n" +
                    "\t2. " + availableshowtimesmovie2[1] + "\n" +
                    "\t3. " + availableshowtimesmovie2[2] + "\n" +
                    "\t4. " + availableshowtimesmovie2[3] + "\n" +
                    "\t5. " + availableshowtimesmovie2[4]);

            System.out.print("Your Choice (1-5): ");
            userTimeChoice = sc.nextInt();

            //            For displaying Ticket
            movieTime = availableshowtimesmovie2[userTimeChoice - 1];

            // If user choice movie 3

        } else if (movieSection.movieNames[userChoice - 1].equals(movieSection.movieNames[2])) {
            System.out.println("SHOW TIME:  \n" +
                    "\t1. " + availableshowtimesmovie3[0] + "\n" +
                    "\t2. " + availableshowtimesmovie3[1] + "\n" +
                    "\t3. " + availableshowtimesmovie3[2] + "\n" +
                    "\t4. " + availableshowtimesmovie3[3] + "\n" +
                    "\t5. " + availableshowtimesmovie3[4]);

            System.out.print("Your Choice (1-5): ");
            userTimeChoice = sc.nextInt();

            //            For displaying Ticket
            movieTime = availableshowtimesmovie3[userTimeChoice - 1];
        }

    }


    // Displaying particular user choosen movie, Available Seats.....

    public static void userSeatChoice(int userChoice) {
        Scanner sc = new Scanner(System.in);
        String userSeatChoice = "";
        System.out.println("AVAILABLE SEATS: ");

        // If user choice movie 1

        if (movieSection.movieNames[userChoice - 1].equals(movieSection.movieNames[0])) {
            for (int i = 0; i < availableseatmovie1.length; i++) {
                System.out.print(availableseatmovie1[i] + ", ");

            }

            System.out.println("\n");
            System.out.print("Enter your choice seats separated by comma(,): ");
            userSeatChoice = sc.nextLine();

            //   For displaying Ticket
            movieSeat = userSeatChoice;

            System.out.print("How many seats did you book?? : ");
            userTotalChooseSeat = sc.nextInt();


            // If user choice movie 2

        } else if (movieSection.movieNames[userChoice - 1].equals(movieSection.movieNames[1])) {
            for (int i = 0; i < availableseatmovie2.length; i++) {
                System.out.print(availableseatmovie2[i] + ", ");

            }
            System.out.println("\n");
            System.out.print("Enter your choice seats separated by comma(,): ");
            userSeatChoice = sc.nextLine();

            //   For displaying Ticket
            movieSeat = userSeatChoice;

            System.out.print("How many seats did you book?? : ");
            userTotalChooseSeat = sc.nextInt();


            // If user choice movie 3
        } else if (movieSection.movieNames[userChoice - 1].equals(movieSection.movieNames[2])) {
            for (int i = 0; i < availableseatmovie3.length; i++) {
                System.out.print(availableseatmovie3[i] + ", ");
            }
            System.out.println("\n");
            System.out.print("Enter your choice seats separated by comma(,): ");
            userSeatChoice = sc.nextLine();

            //   For displaying Ticket
            movieSeat = userSeatChoice;

            System.out.print("How many seats did you book?? : ");
            userTotalChooseSeat = sc.nextInt();
        }


        double movieTotalCost = ticketPrice * userTotalChooseSeat;

        movieCost = movieTotalCost;

        System.out.println("\nThen you have to pay, Rs " + movieTotalCost);


//
        System.out.println("\n\t\tDISPLAYING YOUR TICKET");

        // Calling Ticket Display class - userTicketDisplay() method
        TicketDisplay ticketDisplay = new TicketDisplay();
        TicketDisplay.userTicketDisplay(movieName, movieScreen, movieDay, movieTime, movieSeat, movieCost);


    }



}



