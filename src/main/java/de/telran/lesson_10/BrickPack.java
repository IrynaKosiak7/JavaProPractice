package de.telran.lesson_10;

import java.util.Objects;

public class BrickPack {
    private int idPack;
    private int count;

    public BrickPack(int idPack, int count) {
        this.idPack = idPack;
        this.count = count;
    }

    @Override
    public String toString() {
        return "BrickPack{" +
                "idPack=" + idPack +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrickPack brickPack = (BrickPack) o;
        return idPack == brickPack.idPack && count == brickPack.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPack, count);
    }


}
