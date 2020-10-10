import org.junit.jupiter.api.Test;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class zooTest {
    @Test
    void hirePerson(){
        zoo z = new zoo();
        z.hireWorkPerson("Angelique", "lion caretaker");
        assertTrue(zoo.workPeople.containsKey("Angelique"));
    }
    @Test
    void firePerson(){
        zoo z = new zoo();
        z.fireWorkPerson("Angelique");
        assertFalse(zoo.workPeople.containsKey("Angelique"));
    }
    @Test
    void adoptAnimals(){
        zoo z = new zoo();
        z.adoptAnimals("chinchilla",10);
        assertTrue(zoo.animals.containsKey("chinchilla"));
    }
    @Test
    void sellAnimals(){
        zoo z = new zoo();
        z.sellAnimals("lion");
        assertFalse(zoo.animals.containsKey("lion"));
    }
    @Test
    void payWorkers(){
        zoo z = new zoo();
        z.payWorkers();
        assertEquals(41200, z.fund);
    }
    @Test
    void customerCheckIn(){
        zoo z = new zoo();
        z.customerCheckIn(5);
        assertEquals(54075, z.fund);
    }
    @Test
    void buyAnimalFood(){
        zoo z = new zoo();
        z.buyAnimalFood("lion");
        assertEquals(53650, z.fund);
    }
    @Test
    void sellFood(){
        zoo z = new zoo();
        z.sellFood(10);
        assertEquals(54050, z.fund);
    }
    @Test
    void sellDrinks(){
        zoo z = new zoo();
        z.sellDrinks(10);
        assertEquals(54030, z.fund);
    }
    @Test
    void sellToiletService(){
        zoo z = new zoo();
        z.sellToiletService();
        assertEquals(54001, z.fund);
    }
    @Test
    void hostAnimalShow(){
        zoo z = new zoo();
        z.hostAnimalShow(50);
        assertEquals(55000, z.fund);
    }
}
