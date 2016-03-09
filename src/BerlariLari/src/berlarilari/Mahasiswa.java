package berlarilari;

public class Mahasiswa {

    private long nim;
    private String nama;
    private double jumlahPutaran, jumlah_waktu, jarak, nilai;

    public Mahasiswa(long ni, String na, double putar, double waktu) {
        nim = ni;
        nama = na;
        jumlahPutaran = putar;
        jumlah_waktu = waktu;

    }

   
    public String getNama(){
        return nama;
    }
    public double getJumlahWaktu(){
        return jumlah_waktu;
    }
    public double getJarak(Lapangan lp){
        return lp.getKeliling()*jumlahPutaran;
    }
    public double getNilai(Lapangan lp){
        nilai = getJarak(lp)/getJumlahWaktu();
        return nilai;
    }
    
    
    
}
