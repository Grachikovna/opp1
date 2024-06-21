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
    public void compareStudentWith (HogwartsStudent student1,HogwartsStudent student2) {
        int student1Power = student1.magicPower + student1.transgressionDistance;
        int student2Power = student2.magicPower + student2.transgressionDistance;
        if (student1Power > student2Power) {
            System.out.printf("%s обладает бельшей мощностью магии,чем %s",
                    student1.getName(),student2.getName());
        } else if (student1Power < student2Power) {
            System.out.printf("%s обладает большей мощностью магии,чем %s",
                    student2.getName(),student1.getName());
        } else {
            System.out.printf("%s и %s обладает равносильной мощностью мигии",
                    student1.getName(),student2.getName());
        }
    }
}
