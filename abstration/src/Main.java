public class Main {
    public static void main(String[] args) {
        // Person male = new Person("Luke");
        // male.intAge(23);
        // System.out.println("Male: " + male.getName() + ", " + male.getAge());

        // final Person female = new Person("Mirela", 25);
        // female.setAge(28);
        // System.out.println("Female: " + female.getName() + ", " + female.getAge());

        // System.out.println("-----------");
        // male.intAge(24);
        // System.out.println("Male: " + male.getName() + ", " + male.getAge());

        var personR = new PersonRecord("Mirela", 25);
        System.out.println("RECORD: " + personR);
        System.out.println("RECORD NAME: " + personR.name());
        System.out.println("RECORD AGE: " + personR.age());

        var personR2 = new PersonRecord("Mirela", 0);
    }
}
