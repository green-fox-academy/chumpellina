import java.util.Map;

public class Exercise07 {
    public static void main(String[] args) {
        //Write a Stream Expression to find the frequency of characters in a given string!
        String trialString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras congue tortor fringilla sodales accumsan. Fusce vehicula, nisl in gravida volutpat, nisl urna pretium neque, sed blandit augue tellus at nibh. Aliquam vitae porttitor nisi, sed convallis nunc. Phasellus varius est quis lacinia imperdiet. Curabitur nec aliquet augue, bibendum tincidunt nunc. Mauris sapien justo, egestas nec nunc ac, tristique semper mauris. Phasellus quis purus ac leo egestas faucibus ut et erat.";

        trialString.chars()
                .mapToObj(c -> (char) c)


    }
}
