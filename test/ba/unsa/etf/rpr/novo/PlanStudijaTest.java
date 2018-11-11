package ba.unsa.etf.rpr.novo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PlanStudijaTest {

    @Test
    void constructor() {
        Student s1 = new Student("Amir", "Nakić", 17787);
        Student s2 = new Student("Amila", "Šoše", 17783);
        Student s3 = new Student("Adis", "Panjević", 18361);
        List<Student> studenti1 = new ArrayList<>();
        List<Student> studenti2 = new ArrayList<>();
        List<Student> studenti3 = new ArrayList<>();
        List<Student> studenti4 = new ArrayList<>();
        studenti1.add(s1);
        studenti2.add(s2);
        studenti3.add(s1);
        studenti3.add(s2);
        studenti4.add(s3);
        Predmet p1 = new Predmet("Praktikum automatike", 5, 5, studenti1);
        Predmet p2 = new Predmet("Razvoj programskih rješenja", 5, 5, studenti1);
        Predmet p3 = new Predmet("Projektovanje logičkih sistema", 5, 5, studenti3);
        Predmet p4 = new Predmet("Digitalni sistemi upravljanja", 5, 5, studenti3);
        Predmet p5 = new Predmet("Praktikum elektronike", 5, 5, studenti2);
        Predmet p6 = new Predmet("Digitalni integrirani krugovi", 5, 5, studenti3);
        Predmet p8 = new Predmet("Osnove energetske elektronike", 5, 5, studenti2);
        Predmet p7 = new Predmet("Signali i sistemi", 5, 5, studenti3);
        Predmet p9 = new Predmet("Diskretna matematika", 5, 3, studenti2);
        Predmet p10 = new Predmet("Inženjerska matematika 1", 7, 1, studenti4);
        Predmet p11 = new Predmet("Inženjerska fizika 1", 6, 1, studenti4);
        Predmet p12 = new Predmet("Linearna algebra i geometrija", 5, 1, studenti4);
        Predmet p13 = new Predmet("Osnove elektrotehnike", 7, 1, studenti4);
        Predmet p14 = new Predmet("Osnove računarstva", 6, 1, studenti4);
        Map<Integer, List<Predmet>> m = new HashMap<>();
        List<Predmet> predmeti1 = new ArrayList<>();
        List<Predmet> predmeti2 = new ArrayList<>();
        List<Predmet> predmeti3 = new ArrayList<>();
        predmeti1.add(p1);
        predmeti1.add(p2);
        predmeti1.add(p3);
        predmeti1.add(p4);
        predmeti1.add(p5);
        predmeti1.add(p6);
        predmeti1.add(p7);
        predmeti1.add(p8);
        predmeti2.add(p9);
        predmeti3.add(p10);
        predmeti3.add(p11);
        predmeti3.add(p12);
        predmeti3.add(p13);
        predmeti3.add(p14);
        m.put(5, predmeti1);
        m.put(3, predmeti2);
        m.put(1, predmeti3);
        PlanStudija bachelorStudij = new PlanStudija(m);
        assertAll("test konstruktora",
                () -> assertEquals(m, bachelorStudij.getPlanStudija()));
    }

}