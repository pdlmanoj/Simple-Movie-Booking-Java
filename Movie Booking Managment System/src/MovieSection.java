import java.util.Scanner;

public class MovieSection {

    // creating array fields

    // Array for now showing movie detail
    public static String[] movieNames = {"CHICO MANCHE", "CHARLIE 777", "KABADDI-4"};
    public static String[] movieHours = {"2 hrs", "2 hrs 39 min", "2hrs"};

    // Array for next release movie detail
    public static String[] nextReleasingMovieNames = {"ELVIS", "GHANCHAKKAR", "JUG JUGG JEEYO"};
    public static String[] nextReleasingDates = {"June 24", "June 24", "June 24"};
    public static String[] nextRelesingMovieHours = {"2 hrs 39 mins", "2 hrs", "2hrs 30 mins"};

    // Array for Upcoming movie Detail

    public static  String [] nextUpcomingMovieNames = {"DOKH","LAAL SHING CHDDHA","BRAHMASTRA PART ONE: SHIVE"};
    public static  String [] nextUpcomingDates = {"July 08", "August 11", "September 09"};
    public static String [] nextUpcomingMovieHours = {"2 hrs", "2 hrs", "2hrs"};


    // When user choose, Movies option executing the program....
    public static void movieSectionDetail(int userChoice) {
       int i = 0;

            switch (userChoice) {

                case 1:

                    Scanner sc = new Scanner(System.in);
                    System.out.println("NOW SHOWING ");

                    System.out.println("\t 1. " + movieNames[0] + ":\t" + movieHours[0]);
                    System.out.println("\t 2. " + movieNames[1] + ":\t    " + movieHours[1]);
                    System.out.println("\t 3. " + movieNames[2] + ":\t    " + movieHours[2]);

                    System.out.println("BUY NOW (y/n):");
                    String userInputToBuy = sc.nextLine();

                    if (userInputToBuy.toLowerCase().trim().equals("y")){

                        // calling bookingSection class to access bookingMovie method
                        BookingSection bookingSection = new BookingSection();
                        bookingSection.bookingMovie();
                }
                    else{
                        System.out.println("OKAY, THANK YOU FOR YOUR RESPONSE!!");
                    }

                    break;
                case 2:

                    System.out.println("NEXT RELEASE ");

                    System.out.println("\t1. " + nextReleasingMovieNames[0] + "\n\t\t RELEASING ON: " + nextReleasingDates[0] + "\n\t\t RUNTIME: " + nextRelesingMovieHours[0] + "\n");
                    System.out.println("\t2. " + nextReleasingMovieNames[1] + "\n\t\t RELEASING ON: " + nextReleasingDates[1] + "\n\t\t RUNTIME: " + nextRelesingMovieHours[1] + "\n");
                    System.out.println("\t2. " + nextReleasingMovieNames[2] + "\n\t\t RELEASING ON: " + nextReleasingDates[2] + "\n\t\t RUNTIME: " + nextRelesingMovieHours[2] + "\n");

                    break;
                case 3:

                    System.out.println("UPCOMING RELEASE ");


                    System.out.println("\t1. " + nextUpcomingMovieNames[0] + "\n\t\t RELEASING ON: " + nextUpcomingDates[0] + "\n\t\t RUNTIME: " + nextUpcomingMovieHours[0] + "\n");
                    System.out.println("\t1. " + nextUpcomingMovieNames[1] + "\n\t\t RELEASING ON: " + nextUpcomingDates[1] + "\n\t\t RUNTIME: " + nextUpcomingMovieHours[1] + "\n");
                    System.out.println("\t1. " + nextUpcomingMovieNames[2] + "\n\t\t RELEASING ON: " + nextUpcomingDates[2] + "\n\t\t RUNTIME: " + nextUpcomingMovieHours[2] + "\n");

                    break;

                default:
                    System.out.println("WRONG INPUT ");



            }
        }

    }