package exercise.chapter_41;

public class DepartmentStoreSituation {
    public static void main(String[] args) throws InterruptedException {

        int price = 10_000;
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);

        String hello = "Hello";
        String hello1 = new String("Hello");
        String hello2 = new String("Hello");
        String hello3 = new String("Hello");

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

        while (true) {
            Thread.sleep(100);
        }
    }
}