package exercise.chapter_47;

import java.util.Objects;

public class VIPCustomer extends Customer {

    static int serialNums = 1;  // 부모 클래스 변수 !+ 자식 클래스 변수
    private String agentID;
    private double discountRatio;

    @Override
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }

    public void callAgent() {
        System.out.println("담당직원 " + this.agentID + "님 문의드릴게 있어요~");
    }

    public VIPCustomer(String name) {
        super();    // 부모 생성자 실행 후, 자식 생성자 실행
        super.customerID = "VIP" + serialNums++;
        this.name = name;
        this.customerGrade = "VIP";
        this.bonusPointRatio = 0.05;
        this.bonusPoint = 0;
        this.discountRatio = 0.1;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    @Override
    public String toString() {
        return "VIPCustomer{" +
                "customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", customerGrade='" + customerGrade + '\'' +
                ", bonusPoint=" + bonusPoint +
                ", bonusPointRatio=" + bonusPointRatio +
                ", agentID='" + agentID + '\'' +
                ", discountRatio=" + discountRatio +
                '}';
    }

    @Override
    public void printMyInfo() {
        System.out.println("VIPCustomer: " + toString());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.customerID);
    }
}
