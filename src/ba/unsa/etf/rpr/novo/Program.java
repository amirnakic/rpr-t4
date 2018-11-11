package ba.unsa.etf.rpr.novo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {

    public static void main(String[] args) {
        Student s1 = new Student("Amir", "Nakić", 17787);
        Student s2 = new Student("Amila", "Šoše", 17783);
        List<Student> studenti = new ArrayList<>();
        studenti.add(s1);
        studenti.add(s2);
        Predmet p1 = new Predmet("Praktikum automatike", 5, studenti);
        Predmet p2 = new Predmet("Razvoj programskih rješenja", 5, studenti);
        Predmet p3 = new Predmet("Projektovanje logičkih sistema", 5, studenti);
        Predmet p4 = new Predmet("Digitalni sistemi upravljanja", 5, studenti);
        List<Predmet> predmeti = new ArrayList<>();
        predmeti.add(p1);
        predmeti.add(p2);
        predmeti.add(p3);
        predmeti.add(p4);
        Map<Integer, List<Predmet>> m = new HashMap<>();
        m.put(5, predmeti);
        PlanStudija ps = new PlanStudija("automatika", m);
    }
}
