import java.util.HashMap;
import java.util.Map;

public class Main {
    public static final String BREAKFAST = "breakfast";
    public static final String LUNCH = "lunch";
    public static final String DINNER = "dinner";

    public static void main(String[] arg) {
        Map<String, String> meals = new HashMap<>();
        meals.put(BREAKFAST, "Waffles");
        meals.put(LUNCH, "Gyros");
        meals.put(DINNER, "Enchinladas");

        System.out.println(meals.get("dinner"));

        String lunch = meals.remove("lunch");
        System.out.println(lunch);
        boolean hasLunch = meals.containsKey("lunch");
        boolean hasGyros = meals.containsValue("Gyros");
        int size = meals.size();

        System.out.println(lunch + " " + hasLunch + " " + hasGyros + " " + size);

    }
}