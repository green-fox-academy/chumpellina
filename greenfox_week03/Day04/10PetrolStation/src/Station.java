public class Station {
    int gasAmount;


     int refill(Car x) {
        this.gasAmount = gasAmount+x.capacity;
        return gasAmount;

    }
}


  /*
        Station
    gasAmount
    refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
      */

