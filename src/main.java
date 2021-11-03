import javax.print.DocFlavor;
import java.util.*;

public class main {
    public static void main(String[] args) {
        ArrayList<User> users = createUsers();
        Map<Integer, ArrayList<User>> UseLess = processUsers(users);
        printUserMap(UseLess, 17);
    }

    private static ArrayList<User> createUsers() {
        ArrayList<User> UseList = new ArrayList<>();

        User user1 = new User("Gleb", "Kozhanov", 18);
        UseList.add(user1);

        User user2 = new User("Anna", "Q", 17);
        UseList.add(user2);

        User user3 = new User("Dima", "U", 21);
        UseList.add(user3);

        User user4 = new User("Ivan", "M", 15);
        UseList.add(user4);

        User user5 = new User("Andrew", "E", 17);
        UseList.add(user5);

        User user6 = new User("Sveta", "A", 18);
        UseList.add(user6);

        return UseList;

    }

    private static Map<Integer, ArrayList<User>> processUsers(ArrayList<User> UseLess) {
        Map<Integer, ArrayList<User>> map = new HashMap<>();
        for (User t : UseLess) {
            ArrayList<User> user = new ArrayList<User>();
            if (map.get(t.getAge()) != null) {
                user.addAll(map.get(t.getAge()));
            }
            user.add(t);
            map.put(t.getAge(), user);

        }
        return map;
    }

    public static void printUserMap(Map<Integer, ArrayList<User>> map, Integer age) {
        map.forEach((k,v) -> System.out.println(k + " - " + v));
    }
}
