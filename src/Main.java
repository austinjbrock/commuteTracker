import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        System.out.println("Welcome To Commute Tracker");
    CommuteTracker tracker = new CommuteTracker();
    //Utilize Scanner so we can get user input
    Scanner scanner = new Scanner(System.in);
    String answer = "y";
        while (answer.equals("y")) {
            // grab user input so we can track minutes and update totalMinutes variable
            System.out.println("Enter commute minutes below");
            int minutes = scanner.nextInt();

            System.out.println("What day was this commute?");
            String dayOfWeek = scanner.next();

            Trip trip = new Trip(dayOfWeek,minutes);

            tracker.addTrip(minutes,dayOfWeek);

            System.out.println("Trip Added for " + dayOfWeek);
            System.out.print("Add another trip? (y/n): ");
            answer = scanner.next();
        }
        tracker.showTrips();
    }
}
