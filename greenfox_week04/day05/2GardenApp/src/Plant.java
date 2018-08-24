import java.util.ArrayList;
import java.util.List;

public class Plant {

    private double waterAmount;
    private String color;
    private double absorbation;

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    public double getAbsorbation() {
        return absorbation;
    }

    public Plant() {
    }

    public Plant(double waterAmount, String color, double absorbation) {
        this.waterAmount = waterAmount;
        this.color = color;
        this.absorbation = absorbation;
    }






}


