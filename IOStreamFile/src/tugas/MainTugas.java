/*
Nama : Muhammad Fahri Ilmi
NPM  : 2210010160
*/

package tugas;

public class MainTugas {

    public static void main(String[] args) {

        // Array kategori
        String[] kategori = {
                "Makanan",
                "Minuman",
                "Alat Tulis"
        };

        System.out.println("=== Daftar Kategori ===");

        for (String k : kategori) {
            System.out.println("- " + k);
        }

        System.out.println();

        Gudang gudang = new Gudang("barang.txt");

        gudang.tambahBarang(new Barang("Pensil", 3000, 50));
        gudang.tambahBarang(new Barang("Pulpen", 5000, 40));
        gudang.tambahBarang(new Barang("Buku Tulis", 12000, 30));
        gudang.tambahBarang(new Barang("Penghapus", 2000, 60));
        gudang.tambahBarang(new Barang("Penggaris", 4000, 35));
        gudang.tambahBarang(new Barang("Spidol", 10000, 20));
        gudang.tambahBarang(new Barang("Air Mineral", 4000, 100));
        gudang.tambahBarang(new Barang("Roti", 8000, 25));
        gudang.tambahBarang(new Barang("Susu Kotak", 7000, 45));
        gudang.tambahBarang(new Barang("Snack", 6000, 55));

        gudang.tampilkanSemua();

        gudang.simpanKeBerkas();

        System.out.println();

        Gudang gudangBaru = new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();

        gudangBaru.tampilkanSemua();

        System.out.println();

        System.out.println("Total Nilai Persediaan : Rp" + gudangBaru.totalNilai());

    }

}