// package Tugas3;
import java.util.Scanner;

public class Praktikum3 {
  public static void main(String[] args) {
      // Buat objek Scanner untuk membaca input dari pengguna
      Scanner scanner = new Scanner(System.in);

      // Minta pengguna untuk memasukkan batas perulangan
      System.out.print("Masukkan lantai yang ingin anda tuju: ");
      int batas = scanner.nextInt();

      // Jika batas perulangan adalah 13, langsung jawab "Tombol lantai 13 adalah 14"
      if (batas == 13) {
          System.out.println("Tombol lantai 13 adalah 14");
      } else {
          // Buat perulangan for untuk mencetak angka dari 0 sampai batas, kecuali angka 13
          for (int i = 13; i < batas; i++) {
              if (i == 13) {
                  System.out.println("Tombol lantai 13 adalah 14");
              } else {
                  System.out.print(i + " ");
              }
          }
      }

      // Tutup objek Scanner
      scanner.close();

      // Tampilkan nama dan NIM mahasiswa
      System.out.println("Nama : Soulthan Fadhlillah Bagus");
      System.out.println("NIM : 0110222158");
      System.out.println("Teknik Informatik 09");
  }
}
