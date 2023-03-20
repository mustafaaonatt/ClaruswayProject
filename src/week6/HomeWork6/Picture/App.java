package week6.HomeWork6.Picture;




public class App {
    public static void main(String[] args) {
        Picture pic = new Picture();
        Photograph pth = new Photograph();
        DigitalPhotograph dp = new DigitalPhotograph();
        Painting pt01 = new Painting();

        dp.setTitle("Moon");
        dp.setPrice(500);
        dp.setFrame(true);
        dp.setPhotographer("Mustafa");
        dp.setCamera("Canon");
        dp.deletePhoto();
        dp.contrast();
        dp.discountPrice();
        dp.updatePrice();


    }
}
