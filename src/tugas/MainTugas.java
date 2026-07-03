/* Nama : Therecia Olga Goenawan
NPM  : 2510010421
*/

package tugas;

public class MainTugas {
    public static void main(String[] args) {
        System.out.println("--- Kategori Barang Toko ---");
        String[] kategori = {"Elektronik", "Pakaian", "Makanan"};
        for (String kat : kategori) {
            System.out.println("- Kategori: " + kat);
        }
        System.out.println();
        
        //objek gudang
        Gudang gudangUtama = new Gudang("barang.txt");
        gudangUtama.tambahBarang(new Barang("Laptop", 7500000, 5));
        gudangUtama.tambahBarang(new Barang("Smartphone", 3500000, 10));
        gudangUtama.tambahBarang(new Barang("Kemeja", 150000, 25));
        gudangUtama.tambahBarang(new Barang("Biskuit", 15000, 100));
        gudangUtama.tambahBarang(new Barang("Headphone", 300000, 15));
        
        gudangUtama.tampilkanSemua();
        gudangUtama.simpanKeBerkas();
        System.out.println();
        
        System.out.println("--- Memuat dari objek gudang baru ---");
        Gudang gudangBaru = new Gudang("barang.txt");
        gudangBaru.muatDariBerkas();
        gudangBaru.tampilkanSemua();
        
        System.out.printf("Total nilai persedian gudang: Rp%.0f%n", gudangBaru.totalNilai());
    }
}