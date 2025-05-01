// II. 1. Subclass KuePesanan
class KuePesanan extends Kue{
    // Atribut berat dari class KuePesanan
    private double berat;

    // Constructor subclass KuePesanan dengan super untuk mengambil atribut dari class induk Kue
    public KuePesanan(String nama, double harga, double berat){
        super(nama, harga);
        this.berat = berat;
    }

    // getter untuk berat
    public double getBerat(){
        return berat;
    }

    // Override hitungHarga dengan rumus harga x berat
    @Override
    public double hitungHarga(){
        return getHarga() * berat;
    }

    // Override method toString untuk menampilkan data KuePesanan
    @Override
    public String toString(){
        return "Kue Pesanan : " + super.toString() + ", Berat: " + berat + " Gram, Harga Akhir: " + hitungHarga();
    }
}