public class Main {
    public static void main(String[] args) {
        Gryffindor potter = new Gryffindor("Гарри ", "Поттер ", 70, 40,
                60, 60, 100);
        Gryffindor weasley = new Gryffindor("Рон ", "Уизли ", 30, 20,
                70, 60, 60);
        Gryffindor granger = new Gryffindor("Гермиона ", "Грейнджер ", 60, 50,
                50, 50, 50);
        Slytherin malfoy = new Slytherin("Драко ", "Малфой ", 35, 30, 50,
                45, 45, 35, 60);
        Slytherin montague = new Slytherin(" Грэхэм ", "Монтегю ", 26, 22,
                35, 16, 33, 36, 25);
        Slytherin goyle = new Slytherin("Грегори ", "Гойл ", 13, 15, 16,
                2, 3, 15, 30);
        Hufflepuff smith = new Hufflepuff("Захария ", "Смит ", 16,
                41, 23, 64, 65);
        Hufflepuff diggory = new Hufflepuff("Седрик ", "Диггори ", 50, 45,
                66, 78, 55);
        Hufflepuff finch = new Hufflepuff("Джастин ", "Финч-Флетчли ", 20, 10,
                35, 24, 63);
        Ravenclaw chang = new Ravenclaw("Чжоу ", "Чанг ", 20, 27, 25,
                35, 65, 44);
        Ravenclaw patil = new Ravenclaw("Падма ", "Патил ", 33, 53, 26,
                57, 65, 58);
        Ravenclaw belby = new Ravenclaw("Маркус ", "Белби ", 36, 56, 15,
                63, 47, 85);
        System.out.printf(String.valueOf(weasley));
        weasley.innerCompareTo(potter);
        System.out.printf(String.valueOf(potter));
        granger.innerCompareTo(potter);
        System.out.printf(String.valueOf(malfoy));
        montague.innerCompareTo(malfoy);
        System.out.printf(String.valueOf(montague));
        goyle.innerCompareTo(montague);
        System.out.printf(String.valueOf(smith));
        diggory.innerCompareTo(smith);
        System.out.printf(String.valueOf(finch));
        diggory.innerCompareTo(finch);
        System.out.printf(String.valueOf(chang));
        belby.innerCompareTo(chang);
        System.out.printf(String.valueOf(patil));
        patil.innerCompareTo(belby);

    }
}