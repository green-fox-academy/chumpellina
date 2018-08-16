public class Sharpie {
    String color;
    float width;
    float inkAmout =100;
    public Sharpie (String color, float width){
        this.color= color;
        this.width = width;
        this.inkAmout = inkAmout;
    }

    public Float use (Float inkAmout){
        return this.inkAmout = inkAmout-1;
    }

    public String toString (){
        return "the sharpies color is: " + this.color + '\n' + "the sharpies width is: " + width + '\n' + "the sharpies inkAmount is: " + use(inkAmout);
    }

}


    /*Create Sharpie class
We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
        When creating one, we need to specify the color and the width
        Every sharpie is created with a default 100 as inkAmount
        We can use() the sharpie objects
        which decreases inkAmount */