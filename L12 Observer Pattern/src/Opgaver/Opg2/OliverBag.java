package Opgaver.Opg2;

public class OliverBag implements Observer {

    @Override
    public void update(ObservableBag bag) {
        System.out.println("Olivers bag: " + bag.toString());
    }
}
