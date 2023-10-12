package Opgaver.Opg2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ObservableBag implements Bag{

    HashMap<String, Integer> items = new HashMap<>();
    List<Observer> observers = new ArrayList<>();

    @Override
    public void add(String s) {
        if(items.containsKey(s)) {
        items.put(s, items.get(s) + 1);
        } else {
            items.put(s, 1);
        }
        notifyObserver();
    }

    @Override
    public void remove(String s) {
        if (items.get(s) > 1) {
            items.put(s, items.get(s) - 1);
        } else {
            items.remove(s);
        }
        notifyObserver();
    }

    @Override
    public int getCount(String s) {
        return items.get(s);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObserver() {
        for (Observer obs : observers) {
            obs.update(this);
        }
    }

    @Override
    public String toString() {
        return items + "";
    }
}
