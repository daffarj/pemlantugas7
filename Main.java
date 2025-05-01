public class Main {
    public static void main(String[] args) {
        // III. 1. 20 Array data Kue berbagai Jenis
        Kue[] daftarKue = new Kue[20];

        // III. 2. 20 Objek kue berbagai jenis
        daftarKue[0] = new KuePesanan("Bolen", 25000, 0.5);
        daftarKue[1] = new KueJadi("Bolu Pisang", 30000, 4);
        daftarKue[2] = new KuePesanan("Brownies", 40000, 0.9);
        daftarKue[3] = new KueJadi("Bolu Kukus", 4000, 9);
        daftarKue[4] = new KuePesanan("Kue Kacang", 35000, 1.2);
        daftarKue[5] = new KueJadi("Nastar", 3000, 20);
        daftarKue[6] = new KuePesanan("Red Velvet", 45000, 0.75);
        daftarKue[7] = new KueJadi("Putri Salju", 2500, 15);
        daftarKue[8] = new KuePesanan("Tiramisu", 60000, 0.6);
        daftarKue[9] = new KueJadi("Kastengel", 4000, 12);
        daftarKue[10] = new KuePesanan("Rainbow Cake", 55000, 1.0);
        daftarKue[11] = new KueJadi("Choco Chips", 2000, 25);
        daftarKue[12] = new KuePesanan("Cheesecake", 70000, 0.9);
        daftarKue[13] = new KueJadi("Kue Sagu", 1500, 30);
        daftarKue[14] = new KuePesanan("Pavlova", 65000, 0.5);
        daftarKue[15] = new KueJadi("Lidah Kucing", 1800, 18);
        daftarKue[16] = new KuePesanan("Opera Cake", 75000, 0.7);
        daftarKue[17] = new KueJadi("Kue Cubit", 1000, 40);
        daftarKue[18] = new KuePesanan("Lemon Tart", 48000, 0.65);
        daftarKue[19] = new KueJadi("Kue Semprit", 2200, 22);

        // III. 3. a. Tampilan semua Kue
        System.out.println("===== DAFTAR SEMUA KUE =====");
        for (Kue kue : daftarKue){
            System.out.println(kue);
        }
        System.out.println();

        // III. 3. b. Total harga dari semua jenis kue
        double totalHargaSemuaKue = 0;
        for (Kue kue : daftarKue){
            totalHargaSemuaKue += kue.hitungHarga();
        }
        System.out.println("Total Harga Semua Kue: " + totalHargaSemuaKue);
        System.out.println();

        // III. 3. c. Total harga dan total berat KuePesanan
        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        for(Kue kue : daftarKue){
            if (kue instanceof KuePesanan) {
                KuePesanan kuePesanan = (KuePesanan) kue;
                totalHargaKuePesanan += kuePesanan.hitungHarga();
                totalBeratKuePesanan += kuePesanan.getBerat();
            }
        }
        System.out.println("Total Harga Kue Pesanan: Rp. " + totalHargaKuePesanan);
        System.out.println("Total Berat Kue Pesanan : " + totalBeratKuePesanan + " Kg");
        System.out.println();

        // III. 3. d. Total harga dan total jumlah KueJadi
        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        for(Kue kue : daftarKue){
            if (kue instanceof KueJadi) {
                KueJadi kueJadi = (KueJadi) kue;
                totalHargaKueJadi += kueJadi.hitungHarga();
                totalJumlahKueJadi += kueJadi.getJumlah();
            }
        }
        System.out.println("Total Harga Kue Jadi: Rp. " + totalHargaKueJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlahKueJadi + " pcs");
        System.out.println();

        // III. 3. e. Tampilkan informasi kue dengan harga (harga akhir) terbesar
        Kue kueTermahal = daftarKue[0];
        for(Kue kue : daftarKue){
            if (kue.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = kue;
            }
        }
        System.out.println("Kue dengan Harga Akhir Terbesar: ");
        System.out.println(kueTermahal);
    }
}
