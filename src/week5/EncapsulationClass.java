package week5;

public class EncapsulationClass {
    private  String name;
    private  String idNumber;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static void main(String[] args) {
        EncapsulationClass obj = new EncapsulationClass();

        obj.setName("Vitalii");
        obj.setIdNumber("200055");
        obj.setAge("23");

        String name = obj.getName();
        String IdNumber = obj.getIdNumber();
        String age = obj.getAge();

        System.out.println("obj name : " + name + "\nobj IdNumber : " + IdNumber + "\nobj age : " + age);



    }
}
