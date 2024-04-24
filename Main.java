import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan informasi barang makanan:");
        System.out.print("Nama Barang: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Harga: ");
        double hargaBarang = scanner.nextDouble();
        System.out.print("Stok: ");
        int stokBarang = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Tanggal Kadaluarsa: ");
        String tanggalKadaluarsa = scanner.nextLine();

        Makanan Makanan = new Makanan(namaBarang, hargaBarang, stokBarang, tanggalKadaluarsa);

        
        System.out.println("\nInformasi Barang Makanan:");
        Makanan.tampilkanInfo();

        System.out.print("\nMasukkan jumlah stok yang ingin ditambah: ");
        int jumlahTambahStok = scanner.nextInt();
        Makanan.tambahStok(jumlahTambahStok);
        System.out.println("Stok setelah ditambah: " + Makanan.getStok());

        System.out.print("\nMasukkan jumlah stok yang ingin dikurangi: ");
        int jumlahKurangiStok = scanner.nextInt();
        Makanan.kurangiStok(jumlahKurangiStok);
        System.out.println("Stok setelah dikurangi: " + Makanan.getStok());

        scanner.close();
    }
}
