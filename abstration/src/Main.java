public class Main {
    public static void main(String[] args) {
        Person male = new Person("Luke");
        male.intAge(23);
        System.out.println("Male: " + male.getName() + ", " + male.getAge());
  

        Person female = new Person("Mirela");
        female.intAge(25);
        System.out.println("Female: " + female.getName() + ", " + female.getAge());

        System.out.println("-----------");
        male.intAge(24);
        System.out.println("Male: " + male.getName() + ", " + male.getAge());
    }
}
