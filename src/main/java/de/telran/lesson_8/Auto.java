package de.telran.lesson_8;

public class Auto implements Comparable<Auto>{


    private String numberAuto;
    private  String name;
    private int manufactureYear;

    public String getNumberAuto() {
        return numberAuto;
    }

    public void setNumberAuto(String numberAuto) {
        this.numberAuto = numberAuto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public Auto(String numberAuto, String name, int manufactureYear) {
        this.numberAuto = numberAuto;
        this.name = name;
        this.manufactureYear = manufactureYear;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "numberAuto='" + numberAuto + '\'' +
                ", name='" + name + '\'' +
                ", manufactureYear=" + manufactureYear +
                '}';
    }

    @Override
    public int compareTo(Auto o) {
        return this.getManufactureYear() - o.getManufactureYear();
    }
//    @Override
//    public int compareTo2 (Auto o) {
//        return this.getName().compareTo(o.getName());
//    }
}
