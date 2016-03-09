package berlarilari;

public class Lapangan {

    double panjang, lebar, keliling;

    public Lapangan(double p, double l) {
        panjang = p;
        lebar = l;
    }

    public double getKeliling() {
        keliling = (2 * panjang) + (2 * lebar);
        return keliling;
    }
}
