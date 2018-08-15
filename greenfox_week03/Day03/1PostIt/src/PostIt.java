import java.util.Arrays;

public class PostIt {
    String backgroundColor;
    String text;
    String textColor;

    public PostIt(String backgroundColor, String text, String textColor) {
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }

    public String toString() {
        return this.backgroundColor + this.text + this.textColor;
    }


}




