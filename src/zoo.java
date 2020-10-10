import java.util.HashMap;
import java.util.Map;

public class zoo {
    public int fund = 54000;
    public static Map<String, Integer> animals;
    static {
        animals = new HashMap<>();
        animals.put("giraffe", 2);
        animals.put("zebra", 4);
        animals.put("lion", 2);
        animals.put("hippo", 4);
        animals.put("gorilla", 6);
        animals.put("cheetah", 2);
    }
    public static Map<String, String> workPeople;
    static {
        workPeople = new HashMap<>();
        workPeople.put("Jos", "Janitor");
        workPeople.put("Jef", "cheetah caretaker");
        workPeople.put("Ayisha", "lion caretaker");
        workPeople.put("Ben", "giraffe caretaker");
        workPeople.put("Sammy", "director");
        workPeople.put("Jolien", "zebra caretaker");
        workPeople.put("Amber", "hippo caretaker");
        workPeople.put("Bert", "gorilla caretaker");
    }
    public void hireWorkPerson(String name, String title){
        workPeople.put(name, title);
    }
    public void fireWorkPerson(String name){
        workPeople.remove(name);
    }
    public void adoptAnimals(String name, int amount){
        animals.put(name, amount);
    }
    public void sellAnimals(String name){
        animals.remove(name);
    }
    public void payWorkers(){
        fund = fund-(workPeople.size()*1600);
    }
    public void buyAnimalFood(String animal){
        switch (animal) {
            case "lion" -> fund = fund - 350;
            case "zebra" -> fund = fund - 50;
            case "gorilla" -> fund = fund - 40;
            case "cheetah" -> fund = fund - 160;
            case "hippo" -> fund = fund - 70;
            case "giraffe" -> fund = fund - 10;
        }
    }

    public void customerCheckIn(int amount){
        fund = fund+(amount*15);
    }
    public void sellDrinks(int amount){
        fund = fund+(amount*3);
    }
    public void sellFood(int amount){
        fund = fund+(amount*5);
    }
    public void sellToiletService(){
        fund = fund+1;
    }
    public void hostAnimalShow(int amountOfPeople){
        fund = fund + (20*amountOfPeople);
    }
}
