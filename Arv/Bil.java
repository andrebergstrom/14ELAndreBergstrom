public class Bil extends Fordon {

    public String regNr;
    public int hp;
    public double forbrukning;
    public String BilM;

    public Bil(int p, int v, String f, String r, int h, double b, String m) {
        super(p, v, f);
        regNr = r;
        hp = h;
        forbrukning = b;
        BilM = m;
    }

    public double bransleBehov(double stracka) {

        return (double) (forbrukning * stracka / 10.0);
    }

}