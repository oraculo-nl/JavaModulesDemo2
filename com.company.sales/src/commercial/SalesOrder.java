package commercial;

public class SalesOrder {
    private double revenue;
    private double customer;

    public SalesOrder() {
        System.out.println("Sales order created!");
    }

    public double getRevenue() {
        return revenue;
    }

    public double getCustomer() {
        return customer;
    }
}
