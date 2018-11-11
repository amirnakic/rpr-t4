package ba.unsa.etf.rpr.novo;

public class Upis {
    private Student student;
    private Predmet predmet;
    private PlanStudija planStudija;

    public Upis(Student student, Predmet predmet, PlanStudija planStudija) {
        setStudent(student);
        setPredmet(predmet);
        setPlanStudija(planStudija);
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }

    public PlanStudija getPlanStudija() {
        return planStudija;
    }

    public void setPlanStudija(PlanStudija planStudija) {
        this.planStudija = planStudija;
    }
}
