package ba.unsa.etf.rpr.novo;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        Student s1 = new Student("Amir", "Nakić", 17787);
        Student s2 = new Student("Amila", "Šoše", 17783);
        List<Student> studenti = new ArrayList<>();
        studenti.add(s1);
        studenti.add(s2);
        Predmet p = new Predmet("Praktikum automatike", 5, 5, studenti);
        System.out.println(p.ispisiStudenteNaPredmetu());
    }
}
