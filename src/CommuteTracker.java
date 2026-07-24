import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedMap;
public class CommuteTracker {
    int totalTrips = 0;
    int totalMinutes = 0;
    String lastDayOfWeek = "";
    String departureStation = "";
    String arrivalStation = "";
    //Store every trip so user can see a log

    ArrayList<Trip> trips = new ArrayList<>();

    //Track every trip we take
    public void addTrip(Trip trip) {
        trips.add(trip);
        totalTrips++;
        totalMinutes += trip.minutes;
        lastDayOfWeek = trip.dayOfWeek;
        departureStation = trip.departureStation;
        arrivalStation = trip.arrivalStation;

    }

    //Show All trips that we have completed
    public void showTrips() {
        System.out.println("Total Trips: " + totalTrips);
        System.out.println("Total Commute Minutes: " + totalMinutes);
        System.out.println("Last Commute Day: " + lastDayOfWeek);
        System.out.println("Average commute: " + getAverageCommute() + " minutes");
        System.out.println("Departed from: " + departureStation);
        System.out.println("Arrived at: " + arrivalStation);
    }

    public int getAverageCommute(){
        if (totalTrips == 0) {
            return 0;
        }
        return totalMinutes / totalTrips;
    }
    public int getTotalTrips() {
        return totalTrips;
    }


}
