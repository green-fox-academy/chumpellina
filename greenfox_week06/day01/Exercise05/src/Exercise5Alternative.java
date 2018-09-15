import java.util.ArrayList;
import java.util.List;

public class Exercise5Alternative {
    public static void main(String[] args) {
        String trialString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras congue tortor fringilla sodales accumsan. Fusce vehicula, nisl in gravida volutpat, nisl urna pretium neque, sed blandit augue tellus at nibh. Aliquam vitae porttitor nisi, sed convallis nunc. Phasellus varius est quis lacinia imperdiet. Curabitur nec aliquet augue, bibendum tincidunt nunc. Mauris sapien justo, egestas nec nunc ac, tristique semper mauris. Phasellus quis purus ac leo egestas faucibus ut et erat.";
        List<Character> trialCharSet = toChar(trialString);
        List<Character> upperCaseList = new ArrayList<>();
        for (int i = 0; i < trialCharSet.size(); i++) {
            if (Character.isUpperCase(trialCharSet.get(i)) == true)
                upperCaseList.add(trialCharSet.get(i));
        }

        System.out.println(upperCaseList);
    }

    public static List<Character> toChar(String string) {
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            characters.add(string.charAt(i));
        }
        return characters;
    }

}
