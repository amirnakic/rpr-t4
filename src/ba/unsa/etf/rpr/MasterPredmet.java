package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class MasterPredmet extends Predmet {
    private List<MasterStudent> studenti;

    public MasterPredmet(String nazivPredmeta, String sifraPredmeta, int ects, int maxBrojStudenata) {
        super(nazivPredmeta, sifraPredmeta, ects, maxBrojStudenata);
        this.studenti = new ArrayList<>(this.getTrenutniBrojStudenata());
    }

    
}
