// II. 2. Subclass KueJadi 
class KueJadi extends Kue{
    // Atribut jumlah kue jadi
    private double jumlah;

    // Constructor subclass KueJadi dengan super untuk mengambil atribut dari class induk Kue
    public KueJadi(String nama, double harga, double jumlah){
        super(nama, harga);
        this.jumlah = jumlah;
    }

    // Getter untuk Jumlah
    public double getJumlah(){
        return jumlah;
    }

    // Override hitung harga dengan rumus harga x jumlah x 2
    @Override
    public double hitungHarga(){
        return getHarga()*jumlah*2;
    }

    // Override toString untuk menampilkan data KueJadi
    @Override
    public String toString(){
        return "Kue Jadi: " + super.toString() + ", Jumlah: " + jumlah + " pcs, Harga Akhir: " + hitungHarga();
    }
    
}
