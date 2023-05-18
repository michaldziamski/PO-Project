package virus;

import people.Child;

public final class Acutus extends Virus{
    public Acutus() {
        super(50);
    }

    @Override
    public void infect(Child person) {
        //TODO - RANDOM CHANCE TO INFECT
        String personName = person.getName();
        System.out.println("Infecting " + personName + " with Acutus...");
        person.setStatus("Infected");
        person.setHeartache(true);
    }
}
