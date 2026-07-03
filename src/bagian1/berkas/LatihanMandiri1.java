package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri1 {
    
    public static void main(String[] args) {
        
        File fileLaporan = new File("laporan.txt");
        if (fileLaporan.exists()) {
            System.out.println("Berkas ada, ukuran: " + fileLaporan.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ditemukan.");
        }
        
        File folderArsip = new File("arsip");
        if (folderArsip.mkdir()) {
            System.out.println("Folder 'arsip' berhasil dibuat!");
        } else {
            System.out.println("Folder 'arsip' gagal dibuat (mungkin sudah ada).");
        }
          
        File fileSementara = new File("sementara.txt");
        try {
            fileSementara.createNewFile();
            System.out.println("Sebelum dihapus, ada? " + fileSementara.exists());
            
            fileSementara.delete();
            System.out.println("Sesudah dihapus, ada? " + fileSementara.exists());
        } catch (IOException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }

    }
    
}