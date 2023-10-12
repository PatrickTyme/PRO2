package Opgaver.Opg2;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ObservableBag ob = new ObservableBag();
        OliverBag o = new OliverBag();
        MartinBag m = new MartinBag();

        ob.addObserver(o);
        ob.addObserver(m);

        ob.add("Oel");
        ob.add("Oel");
        ob.remove("Oel");


        for (int i = 0; i < ob.items.size(); i++) {
            ob.add("Oel");
            System.out.println();
        }

        Iterator<String> IterKey = ob.items.keySet().iterator();

        }

    }

