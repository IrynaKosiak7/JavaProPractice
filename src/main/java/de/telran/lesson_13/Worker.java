package de.telran.lesson_13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Worker {


    public static void main(String[] args) {
        Consumer<String> task = (worker1) -> System.out.println(worker1 + " Work in lage");
        task.accept("Vacia");

        task = s -> System.out.println(s + ", dick");
        task.accept("Vacia");

        List<Consumer<String>> tasksDay = new ArrayList<>();
        tasksDay.add((w) -> System.out.println(w + " грузи мусор"));
        tasksDay.add((w) -> System.out.println(w + " носи мешки"));
        tasksDay.add((w) -> System.out.println(w + " перенеси коробки в конец склада"));
        tasksDay.add((w) -> System.out.println(w + " мешай бетон"));
        tasksDay.add((w) -> System.out.println(w + " заполни бланки отгрузки"));

        tasksDay.forEach(task1 -> task1.accept("Vacia"));

        tasksDay.remove(1);
        tasksDay.add(0, new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + ", разгрузи машину с песком");
            }
        });
        System.out.println("---------");
        tasksDay.forEach(task1 -> task1.accept("Vacia"));
        job("Вася", s -> System.out.println(s + " шабаш!"));
        job("Вася", new NewJob());

    }

    public static void job(String name, Consumer<String> jobs) {
        System.out.println("Меня зовут " + name);
        jobs.accept(name);
    }


}

class NewJob implements Consumer<String> {

    @Override
    public void accept(String string) {
        System.out.println(string + ", разгрузи гипсокартон");
    }

}

