package ba.unsa.etf.rpr.novo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void constructor() {
        Student s1 = new Student("Amir", "Nakić", 17787);
        Student s2 = new Student("Amila", "Šoše", 17783);
        List<Student> studenti1 = new ArrayList<>();
        studenti1.add(s1);
        studenti1.add(s2);
        Predmet p = new Predmet("Razvoj programskih rješenja", 5, 5, studenti1);
        Predmet p1 = new Predmet("Razvoj programskih rješenja", 5, 5, studenti1);
        assertAll("test konstruktora",
                () -> assertEquals("Razvoj programskih rješenja", p.getImePredmeta()),
                () -> assertEquals(5, p.getEcts()),
                () -> assertEquals(5, p.getBrojSemestra()),
                () -> assertEquals(studenti1, p.getStudentiNaPredmetu()),
                () -> assertEquals(p, p1));
    }

}