import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pirates pirateOne = new Pirates(0,130, "Captain");
        Pirates pirateTwo = new Pirates(4,4, "Joe");
        Pirates pirateThree = new Pirates(20,2, "OneEyedBill");
        Pirates pirateFour = new Pirates (11, 7, "NoHandsAdam");
        Pirates pirateFive = new Pirates (6, 1, "KillerBud");
        Pirates pirateSix = new Pirates (2, 6, "CharmingPeter");

        System.out.println(pirateTwo.howsItGoingMate(2));

        Ship SantaMaria = new Ship(crew);
       ArrayList<Pirates> crew = new ArrayList<Pirates>();
        SantaMaria.fillShip(crew, pirateOne);
        SantaMaria.fillShip(crew, pirateTwo);
        SantaMaria.fillShip(crew, pirateThree);
        SantaMaria.fillShip(crew, pirateFour);
        SantaMaria.fillShip(crew, pirateFive);
        SantaMaria.fillShip(crew, pirateSix);


        System.out.println(SantaMaria.shipInformations(crew));
    }

}
