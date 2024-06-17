public class HogwartsStudent {
private final String name;
private final String surname;
private final int magicPower;
private final int transgressionDistance;

    public HogwartsStudent(String name, String surname, int magicPower, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
    public void compareStudentWith(HogwartsStudent other) {
    }
}
