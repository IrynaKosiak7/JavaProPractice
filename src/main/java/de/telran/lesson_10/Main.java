package de.telran.lesson_10;

public class Main {
    public static void main(String[] args) {
        BrickPack brick1 = new BrickPack(1, 2000);
        BrickPack brick2 = new BrickPack(2, 2500);
        BrickPack brick3 = new BrickPack(3, 1800);
        BrickPack brick4 = new BrickPack(4, 1700);
        BrickPack brick5 = new BrickPack(5, 2300);
        BrickPack brick6 = new BrickPack(6, 2100);
        BrickPack brick7 = new BrickPack(7, 2250);
        BrickPack brick8 = new BrickPack(8, 2300);

        Warehouse warehouse = new Warehouse(5);
        warehouse.storagePush(brick1);
        warehouse.storagePush(brick2);
        warehouse.storagePush(brick3);
        warehouse.storagePush(brick4);
        warehouse.storagePush(brick5);
        warehouse.storagePush(brick6);
        warehouse.storagePush(brick7);
        warehouse.storagePush(brick8);

        warehouse.print();
        System.out.println(warehouse.warehousePeek());

        System.out.println(warehouse.warehousePop());
        warehouse.print();
        System.out.println(warehouse.warehousePeek());

        QueueWarehouse warehouse1 = new QueueWarehouse(5);
        warehouse1.storageOffer(brick1);
        warehouse1.storageOffer(brick2);
        warehouse1.storageOffer(brick3);
        warehouse1.storageOffer(brick4);
        warehouse1.storageOffer(brick5);
        warehouse1.print();

        System.out.println(warehouse1.warehousePeek());
        warehouse1.print();

//        System.out.println(warehouse1.warehousePoll());


    }
}
