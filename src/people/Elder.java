package people;

public class Elder extends Adult{
    private String name;
    private int healChance = 30;

    private int deathChance = 35;
    private String status = "notInfected";
    private boolean heartache = false;
    private boolean phlegm = false;
    private boolean isVaccinated = false;
    private boolean isDead = false;
    public Elder(String name) {
        super(name);
    }
    @Override
    public void tryAvoidPhysicalContact() {
        this.healChance += 10;
    }
    public boolean getIsDead() {
        return this.isDead;
    }
    public void tryDie() {
        //TODO - RANDOM CHANCE OF DYING
        this.isDead = true;
    }
}
