public class Main {

    public static void main(String[] args) {
        //reference type
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Edit();
    }
}
