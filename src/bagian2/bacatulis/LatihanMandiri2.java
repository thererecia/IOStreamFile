package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LatihanMandiri2 {
    public static void main(String[] args) {
        
        String[] limaHari = {"senin", "selasa", "rabu", "kamis", "jumat"};
        
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {
            for (String h : limaHari) {
                penulis.println(h);
            }
        } catch (IOException e) {
            System.out.println("Gagal menulis : " + e.getMessage());
        }
        
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
        
        try (PrintWriter penulisTambahan = new PrintWriter(new FileWriter("hari.txt", true))) {
            penulisTambahan.println("sabtu");
            penulisTambahan.println("minggu");
        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }
        
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
        
        int jumlahBaris = 0;
        try (BufferedReader pembacaHitung = new BufferedReader(new FileReader("hari.txt"))) {
            while (pembacaHitung.readLine() != null) {
                jumlahBaris++;
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
        System.out.println("Jumlah baris yang ada di berkas: " + jumlahBaris);
    }
}