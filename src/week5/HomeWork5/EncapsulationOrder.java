package week5.HomeWork5;

public class EncapsulationOrder {
    String customerName;
    int orderNumber;
    String orders;
    double orderPrice;
    double changeMoney;

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
