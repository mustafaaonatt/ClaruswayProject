package week5.HomeWork5;

/** Encapsulation Practice class : Please create a class(EncapsulationOrder)
 * and use the variables below for encapsulation practice class. Use the getter and setter methods
 * class name : EncapsulationOrder
 * variables : customerName, OrderNumber, Orders, OrderPrice, changeMoney
 *
 */

public class EncapsulationOrder {
    private String customerName;
    private int orderNumber;
    private String orders;
    private double orderPrice;
    private double changeMoney;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public double getChangeMoney() {
        return changeMoney;
    }

    public void setChangeMoney(double changeMoney) {
        this.changeMoney = changeMoney;
    }

    public static void main(String[] args) {
        EncapsulationOrder obj = new EncapsulationOrder();

        obj.setCustomerName("Mustafa");
        obj.setOrderNumber(001);
        obj.setOrders("Hamburger, Medium Coke, Medium Fries ");
        obj.setOrderPrice(17.20);
        obj.setChangeMoney(2.80);

        String name = obj.getCustomerName();
        int ordernum = obj.getOrderNumber();
        String order = obj.getOrders();
        double orderp = obj.getOrderPrice();
        double orderchange = obj.getChangeMoney();

        System.out.println(name + " " + ordernum + "\n" + order +  "\n" + orderp + " " + "Change money : " + orderchange);
    }


}
