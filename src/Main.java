import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        System.out.println("Welcome To Commute Tracker");
    CommuteTracker tracker = new CommuteTracker();
    //Utilize Scanner so for user input
    Scanner scanner = new Scanner(System.in);
    String answer = "y";
        while (answer.equals("y")) {
            // grab user input s we can track minutes and update totalMinutes variable
            System.out.println("Enter commute minutes below ");
            int minutes = scanner.nextInt();

            System.out.println("What day was this commute?");
            String dayOfWeek = scanner.next();
            System.out.println("AM commute or PM? ");
            String commuteType = scanner.next();
            while(!commuteType.equalsIgnoreCase("AM") && !commuteType.equalsIgnoreCase("PM")){
                System.out.println("Invalid Input. Please Enter AM or PM.");
                commuteType = scanner.next();
            }
            Trip trip = new Trip(dayOfWeek,minutes,commuteType);

            tracker.addTrip(trip);

            System.out.println("Trip Added for " + dayOfWeek);
            System.out.print("Add another trip? (y/n): ");
            System.out.println();
            answer = scanner.next();
        }
        tracker.showTrips();
    }
}
