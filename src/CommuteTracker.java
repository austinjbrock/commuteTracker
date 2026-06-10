// Track every trip to and from
public class CommuteTracker {
    int totalTrips = 0;

    //Add trip
    public void addTrip(){
        totalTrips ++;
    }

    //Delete trips
    public void deleteTrip() {
    }

    //Show All trips
    public void showTrips(){
        System.out.println("Total Trips: " + totalTrips);
    }


}//end commute tracker class
