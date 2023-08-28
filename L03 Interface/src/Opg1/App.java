package Opg1;

public class App {
    public static void main(String[] args) {
        Chili[] chilis = new Chili[3];
        chilis[0] = new Chili("Boombaclat", 5501);

        Beer[] beers = new Beer[3];

        System.out.println(average(chilis, new Filter() {
            @Override
            public boolean accept(Measurable x) {
                return x.getMeasure() > 5000;
            }
        }));
    }
        Measurable[] objects = new Measurable[3];
        public static double average(Measurable[] objects, Filter filter) {
            double sum = 0;
            int count = 0;
            for (Measurable obj : objects) {
                if (filter.accept(obj)) {
                    sum += obj.getMeasure();
                    count++;
                }
            }
            return sum / count;
        }

        public static Measurable max(Measurable[] objects) {
            Measurable max = objects[0];
            for (Measurable obj : objects) {
                if (obj.getMeasure() > max.getMeasure()) {
                    max = obj;
                }
            }
            return max;
        }

    public static Measurable[] blackFridayMeal(Measurable[] chilies, Measurable[] beers) {
        Measurable[] måltid = new Measurable[2];
        måltid[0] = max(chilies);
        måltid[1] = max(beers);
        return måltid;
    }

}

    interface Filter {
        boolean accept(Measurable x);
        }


        interface Measurable {
            double getMeasure();
        }


