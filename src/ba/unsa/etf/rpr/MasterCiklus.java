package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MasterCiklus extends Ciklus {
    private List<MasterSemestar> master;

    public MasterCiklus(int brojSemestara) {
        super(brojSemestara);
        this.master = new ArrayList<>(this.getBROJ_SEMESTARA());
    }

    public List<MasterSemestar> getMaster() {
        return master;
    }

    public void dodajSemestar(MasterSemestar ms) throws IllegalArgumentException, ArrayStoreException {
        if (getMaster().contains(ms)) throw new IllegalArgumentException(ms.ispisiSemestar() + " je vec dodan u ovaj ciklus.");
        else if (getMaster().size() == this.getTrenutniBrojSemestara()) throw new ArrayStoreException(ms.ispisiSemestar() + " nije dodan, jer je popunjen kapacitet ovog ciklusa.");
        else {
            getMaster().add(ms);
            this.setTrenutniBrojSemestara(this.getTrenutniBrojSemestara() + 1);
        }
    }

    public void brisiSemestar(MasterSemestar ms) throws IllegalArgumentException {
        Iterator it = getMaster().iterator();
        while(it.hasNext()) {
            MasterSemestar ms1 = (MasterSemestar) it.next();
            if (ms1.equals(ms)) {
                getMaster().remove(ms);
                this.setTrenutniBrojSemestara(this.getTrenutniBrojSemestara() - 1);
                return;
            }
        }
        throw new IllegalArgumentException(ms.ispisiSemestar() + " nije dodan u ovaj ciklus.");
    }

}
