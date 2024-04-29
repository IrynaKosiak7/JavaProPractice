package de.telran.lesson_10;

import java.util.Stack;

public class Warehouse {
    private Stack<BrickPack> brickPackStack;
    private int size;
    private int count;

    public Warehouse(int size) {
        this.size = size;
        brickPackStack = new Stack<>();
    }

    public boolean storagePush(BrickPack brickPack) {
        if (brickPack == null) {
            return false;
        }
        if (count < size) {
            brickPackStack.push(brickPack);
            count++;
            return true;
        }
        System.err.println("ERROR! Warehouse is full" + brickPack);
        return false;
    }

    public BrickPack warehousePeek(){
        if (count > 0){
            return brickPackStack.peek();
        }
        System.out.println("Warehouse is empty");
        return null;
    }
    public BrickPack warehousePop(){
        if (count > 0){
            count--;
            return brickPackStack.pop();
        }
        System.err.println("Warehouse is empty");
        return null;
    }
    public void print() {
        System.out.println(brickPackStack + " size " + size + ", count " + count);
    }

}
