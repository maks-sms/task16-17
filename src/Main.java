import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        //exercise 1
        String s = "catDog";
        System.out.println(comp(s));


        //exercise 2
        String[] arrey = new String[] {"salt", "tea", "soda", "toast"};
        String[] arrey2 = new String[] {"aa", "bb", "cc", "aAA", "cCC", "d"};

        System.out.println(sotrMap(arrey));
        System.out.println(sotrMap(arrey2));


        //exercise 3
        System.out.println(baseRemove("Hello there", "llo"));
        System.out.println(baseRemove("Hello there", "e"));
        System.out.println(baseRemove("Hello there", "x"));

    }


    public static boolean comp(String s) {
        s = s.toLowerCase();

        Pattern pattern = Pattern.compile("cat");
        Matcher mtcher = pattern.matcher(s);
        int catCount = 0;
        if (mtcher.find()) {
            catCount++;
        }

        pattern = Pattern.compile("dog");
        mtcher = pattern.matcher(s);
        int dogCount = 0;
        if  (mtcher.find()) {
            dogCount++;
        }
        return catCount == dogCount;
    }

    public static Map<String, String> sotrMap(String[] s) {
        Map<String, String> map = new HashMap<>();
        String key;
        String value;

        for (int i = 0; i < s.length; i++) {
            key = Character.toString(s[i].charAt(0));
            if(map.containsKey(key)) {
                value = map.get(key) + s[i];
                map.put(key, value);
            }
            else {
                map.put(key, s[i]);
            }
        }

        return map;
    }

    public static String baseRemove(String base, String remove) {
        return base.replaceAll(remove, "");
    }


}
