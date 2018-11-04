package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class BachelorCiklus extends Ciklus {
    private List<BachelorSemestar> bachelor;

    public BachelorCiklus(int brojSemestara) {
        super(brojSemestara);
        bachelor = new ArrayList<>(this.getTrenutniBrojSemestara());
    }

    public List<BachelorSemestar> getBachelor() {
        return bachelor;
    }

    public void dodajSemestar(BachelorSemestar bs) throws IllegalArgumentException, ArrayStoreException {
        if (getBachelor().contains(bs)) throw new IllegalArgumentException(bs.ispisiSemestar() + " je već dodan u ovaj ciklus.");
        else if (getBachelor().size() == this.getTrenutniBrojSemestara()) throw new ArrayStoreException(bs.ispisiSemestar() + " nije dodan, jer je popunjen kapacitet ovog ciklusa.");
        else {
            getBachelor().add(bs);
            this.setTrenutniBrojSemestara(this.getTrenutniBrojSemestara() + 1);
        }
    }
}
