package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LatihanMandiri2 {

    public static void main(String[] args) {

        // ==========================
        // Nomor 1
        // ==========================
        String[] hari = {
            "Senin",
            "Selasa",
            "Rabu",
            "Kamis",
            "Jumat"
        };

        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {

            for (String h : hari) {
                penulis.println(h);
            }

            System.out.println("Berhasil menulis hari.txt");

        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }

        System.out.println("\nIsi hari.txt:");

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {

            String baris;

            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }

        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        // ==========================
        // Nomor 2
        // ==========================

        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))) {

            penulis.println("Sabtu");
            penulis.println("Minggu");

            System.out.println("\nBerhasil menambahkan data.");

        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }

        System.out.println("\nIsi hari.txt setelah append:");

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {

            String baris;

            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }

        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        // ==========================
        // Nomor 3
        // ==========================

        int jumlahBaris = 0;

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {

            while (pembaca.readLine() != null) {
                jumlahBaris++;
            }

        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        System.out.println("\nJumlah baris: " + jumlahBaris);

    }

}