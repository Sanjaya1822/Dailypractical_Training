import java.util.*;
 
public class RetailOrderDesk {
 
    static ArrayList<Order> orders = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
 
        int choice;
 
        do {
            System.out.println("\n===== RETAIL ORDER DESK =====");
            System.out.println("1. Add Order");
            System.out.println("2. Display Orders");
            System.out.println("3. Remove Order");
            System.out.println("4. Update Order");
            System.out.println("5. Sort by Order ID");
            System.out.println("6. Sort by Customer Name");
            System.out.println("7. Sort by Product Name");
            System.out.println("8. Sort by Price");
            System.out.println("9. Binary Search");
            System.out.println("10. Exit");
 
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
 
            switch (choice) {
 
                case 1:
                    addOrder();
                    break;
 
                case 2:
                    displayOrders();
                    break;
 
                case 3:
                    removeOrder();
                    break;
 
                case 4:
                    updateOrder();
                    break;
 
                case 5:
                    sortById();
                    break;
 
                case 6:
                    sortByCustomer();
                    break;
 
                case 7:
                    sortByProduct();
                    break;
 
                case 8:
                    sortByPrice();
                    break;
 
                case 9:
                    binarySearch();
                    break;
 
                case 10:
                    System.out.println("Thank You!");
                    break;
 
                default:
                    System.out.println("Invalid Choice!");
            }
 
        } while (choice != 10);
    }
 
    // Add Order
    static void addOrder() {
        int orderId=sc.nextInt();
        sc.nextLine();
        String customerName=sc.nextLine();
        String productName=sc.nextLine();
        int quantity=sc.nextInt();
        double price=sc.nextDouble();
        Order order =new Order(orderId,customerName,productName,quantity,price);
        orders.add(order);
    }
 
    // Display Orders
    static void displayOrders() {
        for(Order o:orders){
            System.out.println(o);
        }
    }
 
    // Remove Order
    static void removeOrder() {

        int oid=sc.nextInt();
        for(Order o:orders){
            if(o.orderId==oid){
                orders.remove(o);
                return;
            }
        }
        System.out.println("Order Not Found!");
    }
 
    // Update Order
    static void updateOrder() {
        System.out.print("Enter Order ID: ");
        int oid = sc.nextInt();
        for (Order o : orders) {
            if (o.orderId == oid) {
                sc.nextLine();
                System.out.print("Enter Customer Name: ");
                o.customerName = sc.nextLine();
                System.out.print("Enter Product Name: ");
                o.productName = sc.nextLine();
                System.out.print("Enter Quantity: ");
                o.quantity = sc.nextInt();
                System.out.print("Enter Price: ");
                o.price = sc.nextDouble();
                System.out.println("Order Updated Successfully!");
                return;
            }
        }

        System.out.println("Order Not Found!");
    }
 
    // Sort by Order ID
    static void sortById() {

         orders.sort(Comparator.comparingInt(o -> o.orderId));
         displayOrders();
    }
 
    // Sort by Customer Name
    static void sortByCustomer() {

        orders.sort(Comparator.comparing(o -> o.customerName));
        displayOrders();
    }
 
    // Sort by Product Name
    static void sortByProduct() {

        orders.sort(Comparator.comparing(o->o.productName));
        displayOrders();
    }
 
    // Sort by Price
    static void sortByPrice() {

        orders.sort(Comparator.comparingDouble(o->o.price));
        displayOrders();
    }
 
    // Binary Search
    static void binarySearch() {
        sortById();
        int key = sc.nextInt();
        int low = 0;
        int high = orders.size() - 1;

        while (low <= high) {
            int mid = low + high/ 2;
            if (orders.get(mid).orderId == key) {
                System.out.println(orders.get(mid));
                return;
            } 
            else if (orders.get(mid).orderId < key) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        System.out.println("Order Not Found!");
    }
}