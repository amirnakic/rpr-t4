package ba.unsa.etf.rpr.novo;

import java.util.*;

public class Program {

    public static void main(String[] args) {
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
        Set<Upis> s = new HashSet<>();
        Fakultet etf = new Fakultet("Elektrotehnički fakultet u Sarajevu", s);
        etf.upisi(new Upis(s1, p1, bachelorStudij));
        etf.upisi(new Upis(s1, p2, bachelorStudij));
        etf.upisi(new Upis(s1, p3, bachelorStudij));
        etf.upisi(new Upis(s1, p4, bachelorStudij));
        etf.upisi(new Upis(s1, p7, bachelorStudij));
        etf.upisi(new Upis(s1, p8, bachelorStudij));
        etf.upisi(new Upis(s2, p3, bachelorStudij));
        etf.upisi(new Upis(s2, p4, bachelorStudij));
        etf.upisi(new Upis(s2, p5, bachelorStudij));
        etf.upisi(new Upis(s2, p6, bachelorStudij));
        etf.upisi(new Upis(s2, p7, bachelorStudij));
        etf.upisi(new Upis(s2, p8, bachelorStudij));
        etf.upisi(new Upis(s2, p9, bachelorStudij));
        etf.upisi(new Upis(s3, p10, bachelorStudij));
        etf.upisi(new Upis(s3, p11, bachelorStudij));
        etf.upisi(new Upis(s3, p12, bachelorStudij));
        etf.upisi(new Upis(s3, p13, bachelorStudij));
        etf.upisi(new Upis(s3, p14, bachelorStudij));
        Set<Student> studenti = new HashSet<>();
        Set<Predmet> predmeti = new HashSet<>();
        studenti = etf.dajStudenteUpisaneNaFakultet();
        System.out.println("Studenti upisani na " + etf.getImeFakulteta() + " su:\n");
        for (Student x : studenti)
            System.out.println(x.ispisiStudenta());
        predmeti = etf.dajPredmeteNaKojeSuUpisaniStudenti();
        System.out.println("\nPredmeti koji imaju bar jednog upisanog studenta su:\n");
        for (Predmet y : predmeti)
            System.out.println(y.getImePredmeta());
        predmeti = etf.dajPredmeteNaKojeJeUpisanStudent(s1);
        System.out.println("\nSvi predmeti na koje je upisan student " + s2.ispisiStudenta() + " su:\n");
        for (Predmet z : predmeti)
            System.out.println(z.getImePredmeta());
        studenti = etf.dajStudenteUpisaneNaPredmet(p4);
        System.out.println("\nStudenti koji su upisani na predmet " + p4.getImePredmeta() + " su: \n");
        for (Student l : studenti)
            System.out.println(l.ispisiStudenta());
        predmeti = etf.dajPredmeteUSemestruNaKojeSuUpisaniStudenti(3);
        System.out.println("\nPredmeti u semestru br. 3 na koje su upisani studenti su: ");
        for (Predmet v : predmeti)
            System.out.println(v.getImePredmeta());
        studenti = etf.dajStudenteUpisaneUSemestar(1);
        System.out.println("\nStudenti upisani u semestar br. 1 su: ");
        for (Student d : studenti)
            System.out.println(d.ispisiStudenta());
        etf.ispisiStudentaSaPredmeta(s2, p4);
        if (etf.dajStudenteUpisaneNaPredmet(p4).size() == 1)
            System.out.println("\nStudent " + s2.ispisiStudenta() + " je ispisan sa predmeta " + p4.getImePredmeta() + ".");
        etf.ispisiStudentaSaFakulteta(s3);
        if (etf.dajStudenteUpisaneNaFakultet().size() == 2)
            System.out.println("\nStudent " + s3.ispisiStudenta() + " je ispisan sa fakulteta.");
        System.out.println("\nStudent " + s1.ispisiStudenta() + " u 5. semestru skupio je ukupno " + etf.dajEctsBodoveStudentaUSemestru(s1, 5) + " ECTS bodova.");
    }
}
