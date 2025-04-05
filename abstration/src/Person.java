import java.time.OffsetDateTime;

public class Person {
    private final String name;
    private int age;

    private int intAgeOfYear = OffsetDateTime.now().getYear() - 1;

    public Person(String name) {
        this.name = name;
        this.age = 1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void intAge(int age){
        if (this.intAgeOfYear >= OffsetDateTime.now().getYear()) return;
        this.age = age;
        this.intAgeOfYear = OffsetDateTime.now().getYear();
    }




}
