package week6.HomeWork6;

public class Picture {
    private String title;
    private int price;
    private boolean frame;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFrame() {
        return frame;
    }

    public void setFrame(boolean frame) {
        this.frame = frame;
    }



    public void discountPrice(){
        if (price>=200){
            price -= (price*20)/100;
            System.out.println("You got %20 discount your new price : "+price);
        }

    }
    public void updatePrice(){
        System.out.println("We update the price");

    }
}
