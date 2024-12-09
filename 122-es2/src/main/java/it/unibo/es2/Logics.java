package it.unibo.es2;

public interface Logics {

    boolean hit(int row, int column);

    boolean isAnyRowFull();

    boolean isAnyColumnFull();

}
