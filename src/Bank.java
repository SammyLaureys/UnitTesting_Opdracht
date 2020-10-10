import java.util.HashMap;
import java.util.Map;

public class Bank {
    double answer;
    double newValue1;
    double newValue2;
    Map<String, Double> customers = new HashMap<String, Double>();
    Map<Integer, String> vaults = new HashMap<Integer, String>();

    public void addCustomer(String name, Double amount){
        customers.put(name, amount);
    }

    public void removeCustomer(String name){
        customers.remove(name);
    }

    public void changeCustomerName(String name, String newName, double amount){
        customers.remove(name);
        customers.put(newName, amount);

    }

    public void changeCustomerAmount(String name, double amount, double newAmount){
        customers.remove(name);
        customers.put(name, newAmount);

    }

    public double addValue(String name,Double amount){
        return customers.get(name) + amount;
    }

    public double addIntrest(String name){
        double value = customers.get(name);
        double amount = value*1.09;
        return customers.get(name) + amount;

    }

    public double subtractValue(String name, Double amount){
        return customers.get(name) - amount;
    }

    public double convertToDollar(double amount){
        answer = amount * 1.18;
        return answer;
    }

    public double convertToPounds(double amount){
        answer = amount / 1.91;
        return answer;
    }

    public String printBank(String name){
        return name + " " + customers.get(name);
    }

    public void storeItem(Integer number,String item){
        vaults.put(number,item);
    }

    public Map getItems(){
        return vaults;
    }

    public Map getCustomers(){
        return customers;
    }

    public void transactionFromTo(String name1, String name2, double amount){
        newValue1 = customers.get(name1) - amount;
        newValue2 = customers.get(name2) + amount;
        customers.put(name1 , newValue1);
        customers.put(name2 , newValue2);
    }

    public void getFromVault(int id){
        vaults.remove(id);
    }
}
