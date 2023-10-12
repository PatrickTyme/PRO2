package Opgaver.Opg2;

public class MartinBag implements Observer {

    @Override
    public void update(ObservableBag bag) {
        System.out.println("Martins bag: " + bag.toString());
    }
}
