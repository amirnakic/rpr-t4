package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class BachelorCiklus extends Ciklus {
    private List<BachelorSemestar> bachelor;

    public BachelorCiklus(int brojSemestara) {
        super(brojSemestara);
        bachelor = new ArrayList<>(this.getTrenutniBrojSemestara());
    }
}
