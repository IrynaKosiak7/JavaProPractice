package de.telran.lesson_10;

import java.util.LinkedList;
import java.util.Queue;

public class QueueWarehouse {
   private Queue<BrickPack> queueBrickPack;
    private int size;
    private int count;

    public QueueWarehouse (int size) {
        this.size = size;
        queueBrickPack = new LinkedList<>();
    }
    public void print() {
        System.out.println(queueBrickPack + " size " + size + ", count " + count);
    }
    public BrickPack warehousePeek(){
        if (count > 0){
            return queueBrickPack.peek();
        }
        System.out.println("Warehouse is empty");
        return null;
    }
    public BrickPack warehousePoll(){
        if (count > 0){
            count--;
            return queueBrickPack.poll();
        }
        System.err.println("Warehouse is empty");
        return null;
    }
    public boolean storageOffer(BrickPack brickPack) {
        if (brickPack == null) {
            return false;
        }
        if (count < size) {
            queueBrickPack.offer(brickPack);
            count++;
            return true;
        }
        System.err.println("ERROR! Warehouse is full" + brickPack);
        return false;
    }
}
