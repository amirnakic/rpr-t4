package ba.unsa.etf.rpr.novo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void constructor() {
        Student s = new Student("Amir", "Nakić", 17787);
        assertAll("test konstruktora",
                () -> assertEquals("Amir", s.getIme()),
                () -> assertEquals("Nakić", s.getPrezime()),
                () -> assertEquals(17787, s.getBrojIndeksa()));

    }

    @Test
    void ispis() {
        Student s = new Student("Amila", "Šoše", 17783);
        assertEquals("Amila Šoše (17783)", s.ispisiStudenta());
    }

    @Test
    void equals() {
        assertNotEquals(new Student("Amir", "Nakić", 17787), new Student("Amila", "Šoše", 17783));
    }

}