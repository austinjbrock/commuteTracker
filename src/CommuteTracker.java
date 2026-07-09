public class CommuteTracker {
    int totalTrips = 0;
    int totalMinutes = 0;
    String lastDayOfWeek = "";

    //Track every trip we take
    public void addTrip(int minutes, String dayOfWeek) {
        totalTrips++;
        totalMinutes += minutes;
        lastDayOfWeek = dayOfWeek;
    }

    //Show All trips that we have completed
    public void showTrips() {
        System.out.println("Total Trips: " + totalTrips);
        System.out.println("Total Commute Minutes: " + totalMinutes);
        System.out.println("Last Commute Day: " + lastDayOfWeek);
        System.out.println("Average commute: " + getAverageCommute() + " minutes");
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
