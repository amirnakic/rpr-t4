package ba.unsa.etf.rpr.staro;

import java.util.ArrayList;
import java.util.Iterator;
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

    public void brisiSemestar(BachelorSemestar bs) throws IllegalArgumentException {
        Iterator it = getBachelor().iterator();
        while(it.hasNext()) {
            BachelorSemestar bs1 = (BachelorSemestar) it.next();
            if (bs1.equals(bs)) {
                getBachelor().remove(bs);
                this.setTrenutniBrojSemestara(this.getTrenutniBrojSemestara() - 1);
                return;
            }
        }
        throw new IllegalArgumentException(bs.ispisiSemestar() + " nije dodan u ovaj ciklus.");
    }

    @Override
    public String ispisiCiklus() {
        return ("Bachelor" + super.ispisiCiklus());
    }
}
