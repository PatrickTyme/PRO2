package Opgaver.opg2.barkbehaviors;

public class Growl implements BarkBehavior {
    @Override
    public void bark() {
        System.out.println("Growl! Growl!");
    }
}
