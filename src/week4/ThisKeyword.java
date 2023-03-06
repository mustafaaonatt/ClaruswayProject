package week4;

public class ThisKeyword {
    String name;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword();

        obj.setName("Adam");
        System.out.println("obj name : " + obj.getName() );


    }
}
