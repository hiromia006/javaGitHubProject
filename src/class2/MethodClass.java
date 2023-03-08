package class2;

public class MethodClass {
    private String name;
    private int age;
    private String subject;

    public MethodClass(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;

    }

    //non return
    public void printSomeThings() {
        System.out.println(name + "  " + age + " " + subject);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void sum(int number1, int number2) {
        System.out.println("Sub =: " + number1 + number2);
    }

    public int subtraction(int number1, int number2) {
        return number1 - number2;
    }
}
