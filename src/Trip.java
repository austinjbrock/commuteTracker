public class Trip {
    int minutes;
    String dayOfWeek;
    String commuteType;
    String departureStation;
    String arrivalStation;
    public Trip(String dayOfWeek, int minutes, String commuteType, String departureStation, String arrivalStation) {
        this.minutes = minutes;
        this.dayOfWeek = dayOfWeek;
        this.commuteType = commuteType;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
    }


}
