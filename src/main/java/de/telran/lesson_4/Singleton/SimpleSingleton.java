package de.telran.lesson_4.Singleton;

public class SimpleSingleton {
    public static void main(String[] args) {
        Singelton s1 = Singelton.getInstance();
        System.out.println(s1);

        Singelton s2 = Singelton.getInstance();
        System.out.println(s1);
        SingletonEnum s3 = SingletonEnum.INSTANCE.getInstance();
        System.out.println(s3);
        SingletonEnum s4 = SingletonEnum.INSTANCE;
        System.out.println(s4);

    }

}
