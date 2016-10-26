
public abstract class Fordon {

    public int pris;
    public int vikt;
    public String farg;

    public Fordon(int p, int v, String f) {
        pris = p;
        vikt = v;
        farg = f;
    }

    public int nedsattPris(int rab) {

        return (int)(pris*(1.0-rab/100.0));
    }

}