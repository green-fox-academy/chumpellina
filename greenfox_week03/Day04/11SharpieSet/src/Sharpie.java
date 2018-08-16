public class Sharpie {
    String color;
    float width;
    float inkAmout;



    public Sharpie (String color, float width, float inkAmout){
        this.color = color;
        this.width = width;
        this.inkAmout = inkAmout;
    }



    public String toString (){
        return "the sharpies color is: " + this.color + '\n' + "the sharpies width is: " + width + '\n' + "the sharpies inkAmount is: " + inkAmout+ '\n';
    }

}

