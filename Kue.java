// I. class abstract Kue
abstract class Kue{
    private String nama;
    private double harga;

    // contructor class abstract 
    public Kue(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    // getter untuk harga
    public double getHarga(){
        return harga;
    }

    // Method abstract hitungHarga() 
    public abstract double hitungHarga();
    
    // Method toString() untuk menampilkan data Kue
    public String toString(){
        return "Nama Kue: " + nama + ", Harga: " + harga;
    };
}