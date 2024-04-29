package de.telran.lesson_11;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Transport transport1 = new Transport("Ambulance1", 1, TransportTypes.AMBULANCE);
        Transport transport3 = new Transport("Bus", 2, TransportTypes.BUS);
        Transport transport4 = new Transport("Auto", 2, TransportTypes.AUTO);
        Transport transport5 = new Transport("Auto blue",2 , TransportTypes.AUTO);
        Transport transport6 = new Transport("service", 2, TransportTypes.SERVICE);

        Queue<Transport> transportQueue =  new PriorityQueue<>();
        transportQueue.add(transport6);
        transportQueue.add(transport5);
        transportQueue.add(transport4);
        transportQueue.add(transport1);
        transportQueue.add(transport3);


        System.out.println(transportQueue);

        //time peek
        Queue<Transport> transportsInPeek = new PriorityQueue<>(new Comparator<Transport>() {
            @Override
            public int compare(Transport o1, Transport o2) {
                if (o1.getTypes().equals(TransportTypes.AUTO) || o1.getTypes().equals(TransportTypes.SERVICE)) {
                 o1.setPriorityLevel(3);
                }
                if (o2.getTypes().equals(TransportTypes.AUTO) || o2.getTypes().equals(TransportTypes.SERVICE)) {
                    o2.setPriorityLevel(3);
                }
                return Integer.compare(o1.getPriorityLevel(),o2.getPriorityLevel());
            }
        });


        transportsInPeek.addAll(transportQueue);

        System.out.println(transportsInPeek.peek());
        System.out.println(transportsInPeek.remove());

        System.out.println(transportsInPeek.peek());
        System.out.println(transportsInPeek.remove());
        System.out.println(transportsInPeek);

        // in Alarm
        Queue<Transport> transportsInAlarm = new PriorityQueue<>(new Comparator<Transport>() {
            @Override
            public int compare(Transport o1, Transport o2) {
                if (o1.getTypes().equals(TransportTypes.SERVICE)) {
                    o1.setPriorityLevel(1);
                }
                if (o2.getTypes().equals(TransportTypes.SERVICE)) {
                    o2.setPriorityLevel(1);
                }
                if (o1.getTypes().equals(TransportTypes.AMBULANCE)) {
                    o1.setPriorityLevel(2);
                }
                if (o2.getTypes().equals(TransportTypes.AMBULANCE)) {
                    o2.setPriorityLevel(2);
                }

                if (o1.getTypes().equals(TransportTypes.AUTO)) {
                    o1.setPriorityLevel(2);
                }
                if (o2.getTypes().equals(TransportTypes.AUTO)) {
                    o2.setPriorityLevel(2);
                }
                return Integer.compare(o1.getPriorityLevel(), o2.getPriorityLevel());

            }
        });
        System.out.println();
        transportsInAlarm.addAll(transportQueue);
        System.out.println(transportsInAlarm);
        System.out.println(transportsInAlarm.poll());
        System.out.println(transportsInAlarm.poll());
        System.out.println(transportsInAlarm.peek());
        System.out.println(transportsInAlarm);

    }
}
