public class CommuteTracker {
    int totalTrips = 0;
    int totalMinutes = 0;

    //Track every trip we take
    public void addTrip(int minutes) {
        totalTrips ++;
        totalMinutes += minutes;
    }

    //Show All trips that we have completed
    public void showTrips() {
        System.out.println("Total Trips: " + totalTrips);
        System.out.println("Commute time " + totalMinutes);
    }


}
