package exercise.chapter_40;

public class Customer {

    static int serialNums = 1;

    static {
        System.out.println("Customer class가 로딩 됩니다.");
    }
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
}
