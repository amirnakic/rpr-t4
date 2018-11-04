package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class BachelorSemestar extends Semestar {
    private List<ObavezniBachelorPredmet> obavezniPredmeti;
    private List<IzborniBachelorPredmet> izborniPredmeti;

    public BachelorSemestar(int brojSemestra, int ectsBodovi, int brojObaveznihPredmeta, int brojIzbornihPredmeta) {
        super(brojSemestra, ectsBodovi, brojObaveznihPredmeta, brojIzbornihPredmeta);
        this.obavezniPredmeti = new ArrayList<>(this.getTrenutniBrojObaveznihPredmeta());
        this.izborniPredmeti = new ArrayList<>(this.getTrenutniBrojIzbornihPredmeta());
    }
}
