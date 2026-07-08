import java.util.Scanner;

public class Main {

    public static void main(String [] args){
    CommuteTracker tracker = new CommuteTracker();
    //Utilize Scanner so we can get user input
    Scanner scanner = new Scanner(System.in);
    String answer = "y";
        while (answer.equals("y")) {
            // grab user input so we can track minutes and update totalMinutes variable
            System.out.println("Enter commute minutes");
            int minutes = scanner.nextInt();

            tracker.addTrip(minutes);

            System.out.println("Trip Added");
            System.out.print("Add another trip? (y/n): ");
            answer = scanner.next();
        }
        tracker.showTrips();
    }
}
