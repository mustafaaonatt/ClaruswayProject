package week7.HomeWork7;

public class Person {
    private String name = "Ali";
    private int age = 32;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Details(){
        System.out.println("My name is "+name+". I'm  "+age+" years old. ");
    }
}
