package exercise.chapter_40;

public class DepartmentStoreSituation {
    public static void main(String[] args) {

        int price = 10_000;
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);

        Customer customer1 = new Customer("권율");
        Customer customer2 = new Customer("이순신");

        Customer customer3 = new VIPCustomer("광해군");
        Customer customer4 = new VIPCustomer("아이유");
        Customer customer5 = new VIPCustomer("김혜수");

        Customer customer6 = new GoldCustomer("정우성");
        Customer customer7 = new GoldCustomer("손흥민");

        Customer[] customerQueue = {
                new GoldCustomer("정우영")
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
