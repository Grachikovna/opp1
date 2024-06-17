public class Hufflepuff extends HogwartsStudent {
    private final int hardworking;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, String surname, int magicPower, int transgressionDistance, int hardworking, int loyalty, int honesty) {
        super(name, surname, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
    public void innerCompareTo(Hufflepuff other) {
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
        return hardworking + honesty + loyalty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "hardworking=" + hardworking +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
