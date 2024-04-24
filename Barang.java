public class Barang {
    protected String nama;
    protected double harga;
    private int stok;

    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + getStok());
    }

    
    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi");
        }
    }
    
    public int getStok() {
        return stok;
    }
}
