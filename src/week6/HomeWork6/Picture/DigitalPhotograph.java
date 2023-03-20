package week6.HomeWork6.Picture;



public class DigitalPhotograph extends Photograph {
    private String camera;

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public void deletePhoto(){
        System.out.println("You delete all photos. ");
    }
}
