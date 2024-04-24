public class Makanan extends Barang {
    private String expiredDate;

    public Makanan(String nama, double harga, int stok, String expiredDate) {
        super(nama, harga, stok);
        this.expiredDate = expiredDate;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: " + expiredDate);
    }
}
