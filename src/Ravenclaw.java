public class Ravenclaw extends HogwartsStudent{
    private final int smart;
    private final int wise;
    private final int witty;
    private final int creativity;

    public Ravenclaw(String name, String surname, int magicPower, int transgressionDistance, int smart, int wise, int witty, int creativity) {
        super(name, surname, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }
    public void innerCompareTo(Ravenclaw other) {
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
        return smart + wise + witty + creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                '}';
    }
}
