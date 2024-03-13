import java.util.HashMap;
import java.util.Set;

public class HashMap10 {
    public static void main(String[] args) {
        HashMap <String, String> map = new HashMap<>();
        map.put("one", "AAA");
        map.put("two", "BBB");
        map.put("three", "CCC");
        map.put("four", "DDD");
        map.put("five", "EEE");
        Set valuekeyset= map.entrySet();
        for (Object entry:valuekeyset)
        {
           System.out.println(entry);
        }


    }
}
