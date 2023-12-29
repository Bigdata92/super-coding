package exercise.chapter_44;

public class Customer {

    static int serialNums = 1;

    public String customerID;
    public String name;
    public String customerGrade;

    public int bonusPoint;
    public double bonusPointRatio;

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
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Customer) {
            Customer customer = (Customer) obj;
            return customer.customerID == this.customerID;
        }
        return false;
    }
}
