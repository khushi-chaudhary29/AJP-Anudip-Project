import java.util.HashMap;

public class Lab7a {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("name", "Khushi");
        map.put("course", "MCA");
        map.put("year", "2nd");

        System.out.println("Current HashMap is: " + map);

        String key = "age";
        String value = "21";
        map.put(key, value);

        System.out.println("Updated HashMap is: " + map);
    }
}
