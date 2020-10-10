import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    void addValue(){
        Bank b = new Bank();
        b.addCustomer("Jos",250.30);
        double newValue = b.addValue("Jos", 30.20);
        assertEquals((280.50), newValue);
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
}
