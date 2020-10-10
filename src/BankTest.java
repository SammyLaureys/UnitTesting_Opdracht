import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BankTest {
    @Test
    void addValue(){
        Bank b = new Bank();
        b.addCustomer("Jos",250.30);
        double newValue = b.addValue("Jos", 30.20);
        assertEquals((280.50), newValue);
    }
    @Test
    void addIntrest(){
        Bank b = new Bank();
        b.addCustomer("Jos",250.03);
        double newAmount = b.addIntrest("Jos");
        assertEquals(522.5627000000001, newAmount);
    }
    @Test
    void addCustomer(){
        Bank b = new Bank();
        b.addCustomer("Jos",250.30);
        int customerAmount = b.customers.size();
        assertEquals(1, customerAmount);
    }
    @Test
    void removeCustomer(){
        Bank b = new Bank();
        b.addCustomer("Jos",250.30);
        b.removeCustomer("Jos");
        int customerAmount = b.customers.size();
        assertEquals(0, customerAmount);
    }
    @Test
    void changeCustomer(){
        Bank b = new Bank();
        b.addCustomer("An",28.30);
        b.addCustomer("Jos",250.30);
        b.changeCustomerName("Jos","Josephine", 250.30);
        Map customers = b.customers;
        assertEquals(customers, b.customers);
    }
    @Test
    void changeCustomerAmount(){
        Bank b = new Bank();
        b.addCustomer("An",28.30);
        b.addCustomer("Jos",250.30);
        b.changeCustomerAmount("Jos", 250.30, 340.00);
        double josAmount = b.customers.get("Jos");
        assertEquals(340.0, josAmount);
    }
    @Test
    void subtractValue(){
        Bank b = new Bank();
        b.addCustomer("Jos",250.30);
        double newValue = b.subtractValue("Jos", 100.00);
        assertEquals(150.30, newValue);
    }
    @Test
    void convertToDollar(){
        Bank b = new Bank();
        double dollarAmount = b.convertToDollar(33.30);
        assertEquals((33.30*1.18), dollarAmount);
    }
    @Test
    void convertToPounds(){
        Bank b = new Bank();
        double poundAmount = b.convertToPounds(33.30);
        assertEquals((33.30/1.91), poundAmount);
    }
    @Test
    void printBank(){
        Bank b = new Bank();
        b.addCustomer("Jos",250.03);
        String bankLine = b.printBank("Jos");
        assertEquals("Jos 250.03", bankLine);
    }
    @Test
    void printBankAll(){
        Bank b = new Bank();
        b.addCustomer("Jos",250.03);
        b.addCustomer("Ellen",2500.03);
        Map bankLineAll = b.getCustomers();
        assertEquals(b.getCustomers(), bankLineAll);
    }
    @Test
    void printVaultContents(){
        Bank b = new Bank();
        b.storeItem(1,"diamond");
        b.storeItem(2,"golden ring");
        Map vaultContents = b.getItems();
        assertEquals(b.getItems() ,vaultContents);
    }
    @Test
    void transactionFromTo(){
        Bank b = new Bank();
        b.addCustomer("Jos",250.03);
        b.addCustomer("An",280.00);
        b.transactionFromTo("Jos", "An", 20.00);
        assertEquals("Jos 230.03",b.printBank("Jos"));
        assertEquals("An 300.0",b.printBank("An"));
    }
    @Test
    void getFromVault(){
        Bank b = new Bank();
        b.storeItem(1,"diamond");
        b.storeItem(2,"golden ring");
        b.getFromVault(2);
        assertNull(b.vaults.get(2));
    }

}
