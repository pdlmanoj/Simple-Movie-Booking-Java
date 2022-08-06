public class TicketDisplay {


    // Finally, Displaying user Ticket Details
    public static void userTicketDisplay(String movieName, String movieScreen, String movieDay, String movieTime, String movieSeat, double moiveCost){

        System.out.println("\t----------------------------------------------");
        System.out.println("\t\t\t\t\tIIMS-Cinema Hall");
        System.out.println("\t\t\t\t\tDhobidhara, Kathmandu");
        System.out.println("\t----------------------------------------------");
        System.out.println("||\t\t\t\t\t\t\t\t\t\t\t\t\t||");
        System.out.println("||\t\t\t\t\t\t\t\t\t\t\t\t\t||");
        System.out.println("||\tMovie Name: " + movieName + "\t\t\t\t\t\t\t\t");
        System.out.println("||\tScreen:  " + movieScreen + "\t\t\t\t\t\t\t\t\t||");
        System.out.println("||\tDay:        " + movieDay + "\t\t\t\t\t\t\t\t");
        System.out.println("||\tTime:      " + movieTime + "\t\t\t\t\t\t\t\t||");
        System.out.println("||\tSeat No:   " + movieSeat + " ");
        System.out.println("||\tTotal Cost:   " + moiveCost + "\t\t\t\t\t\t\t\t||");

        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");


        System.out.println("1. Ticket once Sold cannot be refunded.");
        System.out.println("2. Lost, Stolen or damaged tickets will not be replaced.");

        System.out.println("\n\t\t\t\tENJOY YOUR MOVIE !!!");



    }
}
