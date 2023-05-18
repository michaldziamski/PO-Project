package people;

import results.Results;

public class Child {
    private String name;
    private int healChance = 25;
    private String status = "notInfected";
    private boolean heartache = false;
    private boolean phlegm = false;
    private final boolean isVaccinated = false;

    private final boolean isDead = false;

    public Child (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void tryAvoidPhysicalContact() {
        //TODO - RANDOM CHANCE OF AVOIDING PHYSICAL CONTACT
        this.healChance += 10;
    }

    public int getHealChance() {
        return healChance;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setHeartache(boolean hasHeartache) {
        this.heartache = hasHeartache;
    }

    public boolean getHeartache() {
        return this.heartache;
    }

    public void setPhlegm(boolean hasPhlegm) {
        this.phlegm = hasPhlegm;
    }

    public boolean getPhlegm() {
        return this.phlegm;
    }

    public boolean getIsVaccinated() {
        return this.isVaccinated;
    }

    public void tryToHeal() {
        //TODO - DRAWING A CHANCE TO HEAL
        boolean healDrawed = true;
        if(healDrawed) {
            setStatus("Healed");
            Results.healedCount++;
        }

    }

    public boolean getIsDead() {
        return this.isDead;
    }
}
