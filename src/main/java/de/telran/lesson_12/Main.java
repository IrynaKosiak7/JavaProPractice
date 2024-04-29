package de.telran.lesson_12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Ivan", 1, 10);
        Manager manager2 = new Manager("Oleg", 2, 15);
        Manager manager3 = new Manager("Anna", 3, 20);
        Manager manager4 = new Manager("Inna", 4, 7);

        Sale sale1 = new Sale(1, 5000);
        Sale sale2 = new Sale(2, 3000);
        Sale sale3 = new Sale(3, 5000);
        Sale sale4 = new Sale(4, 1000);
        Sale sale5 = new Sale(2, 2000);
        Sale sale6 = new Sale(1, 5000);
        Sale sale7 = new Sale(4, 7000);
        Sale sale8 = new Sale(3, 1000);

        List<Sale> sales = new ArrayList<>(Arrays.asList(sale1,sale2,sale3,sale4,sale5,sale6,sale7,sale8));
        Map<Integer, Manager> managerMap = new HashMap<>();
        managerMap.put(manager1.getId(), manager1);
        managerMap.put(manager2.getId(), manager2);
        managerMap.put(manager3.getId(), manager3);
        managerMap.put(manager4.getId(), manager4);

        Map<Integer, Double> mapSalary = new HashMap<>();
        for (Sale sale: sales){
            Manager manager = managerMap.get(sale.getIdManager());
            if (!mapSalary.containsKey(sale.getIdManager())){
                mapSalary.put(sale.getIdManager(), sale.getSumSale().doubleValue()/  100 * manager.getPercent());
            }else {
                Double sum = mapSalary.get(manager.getId());
                mapSalary.put(sale.getIdManager(), sum + sale.getSumSale().doubleValue()/  100 * manager.getPercent());
            }
            System.out.println(managerMap);
            for (Map.Entry<Integer, Double> element : mapSalary.entrySet()){
                Manager manag = managerMap.get(sale.getIdManager());
                System.out.println(manag.getName()+ " verdient "+ element.getValue());
            }
        }






    }
}
