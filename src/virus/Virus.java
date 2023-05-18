package virus;

import people.Child;

public abstract class Virus {
    protected double infectionChance;

    public Virus(double infectionChance) {
        this.infectionChance = infectionChance;
    }
    abstract public void infect(Child person);
}

