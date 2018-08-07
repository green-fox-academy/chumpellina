import com.sun.deploy.util.StringUtils;

public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";
        url= url.replace ("bots",  "odds");
        String jourl = "https://www.reddit.com/r/nevertellmetheodds/";
        url = url.replace("https//", "hhtps://");
        System.out.println(url);
        }

    }

