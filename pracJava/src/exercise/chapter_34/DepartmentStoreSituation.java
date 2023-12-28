package exercise.chapter_34;

public class DepartmentStoreSituation {
    public static void main(String[] args) {

        int price = 10_000;
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);

        Customer customer1 = new VIPCustomer("아이유");

        Customer[] customerQueue = {
                new Customer("권율"), new Customer("이순신"), new VIPCustomer("광해군"),
                customer1, new Customer("김좌진"), customer1,
                new Customer("장원영"), customer1, new VIPCustomer("김혜수"),
                new GoldCustomer("정우영"), new GoldCustomer("정우성"), new GoldCustomer("손흥민")
        };

        for (Customer customer : customerQueue) {
            customer.printMyInfo();
            int cash = staff.helpPayment(customer, price);
            System.out.println("cash = " + cash);
            staff.addSalesAmount(cash);
        }

        staff.printMySalesAmount();
    }
}
