public class AppendA {

    public static void main (String[] args){
    String typo = "Chinchill";
    String returnValue = appendAFunct(typo);
        System.out.println(returnValue);
    }

    public static String appendAFunct (String typo) {
        String a = "a";
        String ret = typo + a;
        return ret;
    }

}
