import java.util.ArrayList;
import java.util.List;

public class Garden extends Plant {
    Plant myPlants = new Plant();
    List<Plant> myGarden = new ArrayList<Plant>();


    public void add(Plant plant) {
        myGarden.add(plant);

    }


    public void giveWaterFirst(ArrayList<Plant> x) {
        for (int i = 0; i < myGarden.size() - 1; i++) {
            if (myGarden.get(i).getWaterAmount() < 5) {
                double waterAmount = myGarden.get(i).getWaterAmount();
                waterAmount += myGarden.get(i).getAbsorbation() * 10;
                myGarden.get(i).setWaterAmount(waterAmount);
            } else System.out.println(myGarden.get(i) + " doesn't need water");

        }

    }

    public void giveWaterSecond(ArrayList<Plant> x) {
        for (int i = 0; i < myGarden.size() - 1; i++) {
            if (myGarden.get(i).getWaterAmount() < 5) {
                double waterAmount = myGarden.get(i).getWaterAmount();
                waterAmount += myGarden.get(i).getAbsorbation() * 35;
                myGarden.get(i).setWaterAmount(waterAmount);
            } else System.out.println(myGarden.get(i) + " doesn't need water");

        }

    }

    public void giveWaterThird(ArrayList<Plant> x) {
        for (int i = 0; i < myGarden.size() - 1; i++) {
            if (myGarden.get(i).getWaterAmount() < 10) {
                double waterAmount = myGarden.get(i).getWaterAmount();
                waterAmount += myGarden.get(i).getAbsorbation() * 35;
                myGarden.get(i).setWaterAmount(waterAmount);
            } else System.out.println(myGarden.get(i) + " doesn't need water");

        }

    }


}

