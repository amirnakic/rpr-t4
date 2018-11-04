package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class MasterCiklus extends Ciklus {
    private List<MasterSemestar> master;

    public MasterCiklus(int brojSemestara) {
        super(brojSemestara);
        this.master = new ArrayList<>(this.getBROJ_SEMESTARA());
    }
}
