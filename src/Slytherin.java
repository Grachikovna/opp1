public class Slytherin extends HogwartsStudent {
    private final int tricky;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int power;

    public Slytherin(String name,
                     String surname,
                     int magicPower,
                     int transgressionDistance,
                     int tricky,
                     int determination,
                     int ambition,
                     int resourcefulness,
                     int power) {
        super(name, surname, magicPower, transgressionDistance);
        this.tricky = tricky;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getTricky() {
        return tricky;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPower() {
        return power;
    }
    public void innerCompareTo(Slytherin other) {
        if (this.scoreSum() < other.scoreSum()) {
            System.out.println("Сильнее студент " + other.getName() + other.getSurname());
        } else if (this.scoreSum() > other.scoreSum()) {
            System.out.println("Сильнее студент " + this.getName() + this.getSurname());
        } else {
            System.out.printf("Студенты %s и %s равны по силе", this.getName(), other.getName(),
                    this.getSurname(), other.getSurname());
        }
    }

    private int scoreSum() {
        return tricky + determination + ambition + resourcefulness + power;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "tricky=" + tricky +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", power=" + power +
                '}';
    }
}
