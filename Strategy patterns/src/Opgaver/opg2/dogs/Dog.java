package Opgaver.opg2.dogs;

import Opgaver.opg2.barkbehaviors.BarkBehavior;
import Opgaver.opg2.eatbehaviors.EatBehavior;

public abstract class Dog {
    private BarkBehavior barkBehavior;
    private EatBehavior eatBehavior;

    public Dog() {
    }

    public abstract void display();

    public void performBark() {
        this.barkBehavior.bark();
    }

    public void performEat() {
        this.eatBehavior.eat();
    }
    public void walk() {
        System.out.println("All dogs walk, unless they don't have legs, because then they have wheels and then they drive");
    }

    public void setBarkBehavior(BarkBehavior barkBehavior) {
        this.barkBehavior = barkBehavior;
    }

    public void setEatBehavior(EatBehavior eatBehavior) {
        this.eatBehavior = eatBehavior;
    }
}
