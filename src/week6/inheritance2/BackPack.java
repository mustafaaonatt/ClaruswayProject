package week6.inheritance2;

public class BackPack extends Bag{
    private  int numOfPockets;
    private  int numOfStraps;
    private  boolean backSupport;

    public int getNumOfPockets() {
        return numOfPockets;
    }

    public void setNumOfPockets(int numOfPockets) {
        this.numOfPockets = numOfPockets;
    }

    public int getNumOfStraps() {
        return numOfStraps;
    }

    public void setNumOfStraps(int numOfStraps) {
        this.numOfStraps = numOfStraps;
    }

    public boolean isBackSupport() {
        return backSupport;
    }

    public void setBackSupport(boolean backSupport) {
        this.backSupport = backSupport;
    }
}
