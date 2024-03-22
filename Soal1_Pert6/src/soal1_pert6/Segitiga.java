package soal1_pert6;

public class Segitiga{
    private double alas;
    private double tinggi;
    private double sisi;

    public Segitiga(){
        this.alas = 0;
        this.tinggi = 0;
        this.sisi = 0;
    }

    public Segitiga(double alas, double tinggi, double sisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public void setAlas(double alas){
        this.alas = alas;
    }

    public double getAlas(){
        return alas;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public double getTinggi(){
        return tinggi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void getLuasSegitiga(){
        double luasSegitiga = this.alas * this.tinggi / 2;

        System.out.printf("Luas Segitiga adalah %.2f\n", luasSegitiga);
    }

    public void getKelilingSegitiga(){
        double kelilingSegitiga = this.sisi + this.sisi + this.sisi;

        System.out.printf("Keliling Segitiga adalah %.2f\n", kelilingSegitiga);
    }
}