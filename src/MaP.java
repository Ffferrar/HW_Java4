import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MaP {
    public static Map<String, String> createMap() {
        Map name = new HashMap();
        return name;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        Map map_copy = new HashMap();
        map_copy.putAll(map);

        String previously_value = null;
        String previously_key = null;
        for (var key : map_copy.keySet()){
            if ( map.get(key).equals(previously_value) ){
                //map.remove(key, map.get(key));
                //map.remove(previously_key, map.get(previously_key));
                removeItemFromMapByValue(map, (String) key);
                removeItemFromMapByValue(map, previously_key);
            }
            else {
                previously_value = map.get(key);
                previously_key = (String) key;
            }
        }
    }
    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        map.remove(value);
    }
    public static void printMap(Map<String, String> map){
        map.forEach((k,v) -> System.out.println(k + " - " + v));
    }

    public static void main(String[] args) {
        Map name = createMap();

        name.put("Kush", "Artem");
        name.put("Prach", "Vlad"); //
        name.put("Bryantsev", "Vsevolod");
        name.put("Bryantev", "Vlad"); //
        name.put("Antonoova", "Sveta");
        name.put("Antonova", "Nika");
        name.put("Malina", "Sonya");
        name.put("Kozhanov", "Gleb");
        name.put("Sgarga", "Dmitriy");//
        name.put("Kuznetsov", "Dmitriy"); //
        removeTheFirstNameDuplicates(name);
        printMap(name);
    }

}
