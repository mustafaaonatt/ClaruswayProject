package week8.Interface;

public  abstract class Cat implements Animal,Mammal{
    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink");
    }

    @Override
    public void nurse() {
        System.out.println("Cats nurse their young child with milk");
    }

    @Override
    public void blood() {
        System.out.println("Cats are worm-blooded.");
    }

    @Override
    public void heart() {
        System.out.println("Cats posses four-chambered hearts");
    }
}
