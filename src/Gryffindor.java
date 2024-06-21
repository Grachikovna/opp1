public class Gryffindor extends HogwartsStudent {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name,
                      String surname,
                      int magicPower,

                      int transgressionDistance,
                      int nobility,
                      int honor,
                      int bravery) {
        super(name, surname, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
    public void innerCompareTo(Gryffindor other) {
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
        return nobility + honor + bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
