import java.util.Map;

public class User {
    public String name;
    public String surname;
    public Integer age;

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
    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }
}
