package exercise.chapter_47;

import java.util.Objects;

public class Customer {

    static int serialNums = 1;

    protected String customerID;
    protected String name;
    protected String customerGrade;

    protected int bonusPoint;
    protected double bonusPointRatio;

    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }

    public Customer() {
    }

    public Customer(String customerID, String name) {
        this(name);     // Customer(String name)
        this.customerID = customerID;
    }

    public Customer(String name) {
        this.customerID = "Customer" + serialNums++;
        this.name = name;
        this.customerGrade = "SILVER";
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", customerGrade='" + customerGrade + '\'' +
                ", bonusPoint=" + bonusPoint +
                ", bonusPointRatio=" + bonusPointRatio +
                '}';
    }

    public void printMyInfo() {
        System.out.println("Customer: " + toString());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.customerID);
    }
}
