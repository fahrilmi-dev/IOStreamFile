package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri1 {
    public static void main(String[] args) {

        // =========================
        // Nomor 1
        // =========================
        File laporan = new File("laporan.txt");

        if (laporan.exists()) {
            System.out.println("Berkas laporan.txt ada.");
            System.out.println("Ukuran berkas: " + laporan.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ditemukan.");
        }

        System.out.println();

        // =========================
        // Nomor 2
        // =========================
        File folder = new File("arsip");

        if (folder.mkdir()) {
            System.out.println("Folder arsip berhasil dibuat.");
        } else {
            System.out.println("Folder arsip gagal dibuat atau sudah ada.");
        }

        System.out.println();

        // =========================
        // Nomor 3
        // =========================
        File sementara = new File("sementara.txt");

        try {
            sementara.createNewFile();

            System.out.println("Sebelum dihapus: " + sementara.exists());

            sementara.delete();

            System.out.println("Sesudah dihapus: " + sementara.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

    }
}
