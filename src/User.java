import java.util.Map;

public class User {
    private String name;
    private String surname;
    private Integer age;

    public User (String name, String surname, Integer age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

}
