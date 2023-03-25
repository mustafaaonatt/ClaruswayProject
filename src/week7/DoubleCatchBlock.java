package week7;

public class DoubleCatchBlock {
    public int arr[] = new int[10];

    public void writeList() {
        try {
            arr[10] = 11;
        } catch (NumberFormatException eNF) {
            System.out.println("NumberFormatException => " + eNF.getMessage());
        }
        catch (IndexOutOfBoundsException eIOB){
            System.out.println("IndexOutOfBoundsException => " + eIOB.getMessage() );
        }

    }

    public static void main(String[] args) {
        DoubleCatchBlock obj = new DoubleCatchBlock();
        obj.writeList();
    }
}