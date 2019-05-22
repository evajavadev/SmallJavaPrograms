package LexiconRehearsals.Task11_WhatsYourNameProgram;


public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }
}