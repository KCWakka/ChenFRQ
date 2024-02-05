import java.util.ArrayList;

public class Airport  {
    /** A list of the flights into and out of this airport
     *  Guaranteed not to be null and to contain only non-null entries
     */
    private ArrayList<Flight> allFlights;

    public Airport(ArrayList<Flight> flights) {
        allFlights = flights;
    }

    public ArrayList<Flight> getAllFlights() {
        return allFlights;
    }

    /** Returns the revenue generated by all flights at the airport,
     *  as described in part (a)
     */
    public double getTotalRevenue() {
        /* to be implemented in part (a) */
        double count = 0;
        int people = 0;
        for (int i = 0; i < allFlights.size(); i++) {
            int passengers = allFlights.get(i).getNumPassengers();
            int capacity = allFlights.get(i).getCapacity();
            if (passengers > capacity) {
                people = capacity;
            } else {
                people = passengers;
            }
            count += people * allFlights.get(i).getPrice();
        }
        return count;
    }

    /** Updates the list of flights by removing certain flights and
     *  returns the total number of passengers whose flights were removed,
     *  as described in part (b)
     */
    public int updateFlights() {
        /* to be implemented in part (b) */
        int count = 0;
        for (int i = 0; i < allFlights.size(); i++) {
            double passengers = allFlights.get(i).getNumPassengers();
            double capacity = allFlights.get(i).getCapacity();
            if (passengers / capacity < 0.20) {
                count += passengers;
                allFlights.remove(i);
                i--;
            }
        }
        return count;
    }
}
