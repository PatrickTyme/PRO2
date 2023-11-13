package Opgaver.Opg1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class MyTime implements Serializable {
    private int time = 0;

    private List<String> times;


    public int increase() {
        return time++;
    }

    public int reset() {
        return time = 0;
    }

    public int getTime() {
        return time;
    }

    public void saveTime() {
        times.add(String.valueOf(time));
    }
}

