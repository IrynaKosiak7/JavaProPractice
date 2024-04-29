package de.telran.lesson_14;

import java.util.*;
import java.util.stream.Collectors;

public class SimpleManager {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Opanas", "Director", "Boss", 12000.00);
        Manager manager2 = new Manager("Izya", "PomDirect", "Planing", 8000.00);
        Manager manager6 = new Manager("Izyaslav", "PomDirect", "Planing", 8000.00);
        Manager manager8 = new Manager("ILlya", "PomDirect", "Planing", 9000.00);
        Manager manager3 = new Manager("Salomon", "SalesManager", "Boss", 5000.00);
        Manager manager7 = new Manager("Jork", "SalesManager", "Boss", 9000.00);
        Manager manager4 = new Manager("Anton", "Intern", "Sales", 10000.00);
        Manager manager5 = new Manager("Wasya", "JobManager", "Sales", 8000.00);
        Manager manager9 = new Manager("Wasya", "JobManager", "Sales", 4000.00);
        Manager manager10 = new Manager("Wasya", "JobManager", "Sales", 5000.00);

        List<Manager> managerList = List.of(manager2, manager1, manager3, manager4, manager5, manager6, manager7, manager8, manager9, manager10);

        managerList.forEach(System.out::println);
        List<Manager> salaryBig = managerList.stream()
                .filter(manager -> manager.getSalary() >= 10000)
                .collect(Collectors.toList());
        System.out.println(salaryBig);

        System.out.println(" Вычислить среднюю зарплату всех сотрудников");

        OptionalDouble average = managerList.stream()
                .mapToDouble(manager -> manager.getSalary())
                .average();
        System.out.println(average);

        System.out.println(average.getAsDouble());

        System.out.println(average.orElse(0.00));
        System.out.println(average.isPresent());
        System.out.println(average.isEmpty());


        System.out.println("Получить список сотрудников из отдела Boss и увеличить зп на 15% ");
        System.out.println(managerList.stream()
                .filter(manager -> manager.getDepartmen().startsWith("Boss"))
                .map(manager -> manager.getSalary() * 1.15)
                .toList());

        System.out.println("-------------------");

        System.out.println(managerList.stream()
                .filter(manager -> manager.getDepartmen().startsWith("Boss"))
                .map(manager -> new Manager(manager.getName(), manager.getPosition(), manager.getDepartmen(), manager.getSalary() * 1.15))
                .toList());

        System.out.println("-------------------");

        System.out.println("Получить сотрудника с самой низкой зп ");

        System.out.println(managerList.stream()
                .min(Comparator.comparing(Manager::getSalary)));

        System.out.println(" Получить сотрудника с самой высокой зп ");

        System.out.println(managerList.stream()     //получаем только сумму
                .mapToDouble(Manager::getSalary)
                .max().getAsDouble());
        // Если нужен сотрудник
        System.out.println(managerList.stream()
                .max(Comparator.comparing(Manager::getSalary)));

        System.out.println("Получите сотрудников из всех отделов с максимальной зп: ");
//        Map<Double, Manager> collectWithMaxSalary = managerList.stream().sorted(Comparator.comparing(s -> s.getSalary())).collect(Collectors.toMap(Manager::getSalary, e -> e));
        Map<String, Optional<Manager>> groupByWithMaxSalary = managerList.stream().collect(Collectors.groupingBy(d -> d.getDepartmen(), Collectors.maxBy(Comparator.comparingDouble(s -> s.getSalary()))));
        System.out.println(groupByWithMaxSalary);

        System.out.println(" Сгрупировать сотрудников по должности");

        System.out.println(managerList.stream()
                .collect(Collectors.groupingBy(m -> m.getPosition())));

        System.out.println("--");

        Map<String, List<Manager>> groupMap =  managerList.stream()
                .collect(Collectors.groupingBy(m -> m.getDepartmen()));

        for (Map.Entry entry : groupMap.entrySet()){
            System.out.println(entry);
        }

        System.out.println(" Вывести имена людей по департаментам");
        System.out.println(managerList.stream()
                .collect(Collectors.groupingBy(m -> m.getDepartmen(),
                        Collectors.mapping(o -> o.getName(), Collectors.toList()))));

        System.out.println(" Вывести имена людей по департаментам");
        System.out.println(managerList.stream()
                .collect(Collectors.groupingBy(m -> m.getDepartmen(),
                        Collectors.mapping(o -> o.getName(), Collectors.joining(", ")))));  System.out.println(managerList.stream()
                .collect(Collectors.groupingBy(m -> m.getDepartmen(),
                        Collectors.mapping(o -> o.getName(), Collectors.joining(", ", "{","}")))));


        System.out.println(" Вывести обощенную информацию о департаменте ");

        Map<String, DoubleSummaryStatistics> summarizingMap = managerList.stream()
                .collect(Collectors.groupingBy(m -> m.getDepartmen(), Collectors.summarizingDouble(Manager::getSalary)));
        System.out.println(summarizingMap);

        System.out.println("max salary Boss departament - " + summarizingMap.get("Boss").getMax());
        System.out.println("Average departament Planing - " + summarizingMap.get("Planing").getAverage());

        System.out.println(managerList.stream()
                .collect(Collectors.groupingBy(m->m.getDepartmen(), Collectors.averagingDouble(Manager::getSalary))));
 System.out.println(managerList.stream()
                .collect(Collectors.groupingBy(m->m.getDepartmen(), Collectors.groupingBy(Manager::getPosition))));
System.out.println(managerList.stream()
                .collect(Collectors.groupingBy(m->m.getDepartmen(), Collectors.groupingBy(Manager::getPosition,Collectors.mapping(Manager::getName, Collectors.toList())))));

    }



}
