package Tugas10.Builder;

public class BuilderDemo {
    public static void main(String[] args) {

        // Output welcome message dan daftar harga
        System.out.print("Welcome to GLODOK!");
        System.out.print("\n");
        System.out.print("Berikut adalah list harga yang kami tawarkan");
        System.out.print("\n");
        System.out.print("============================================================");
        System.out.print("\n");

        CDBuilder cdBuilder = new CDBuilder();

        CDType cdType1 = cdBuilder.buildSonyCD();
        cdType1.showItems();

        CDType cdType2 = cdBuilder.buildSamsungCD();
        cdType2.showItems();

        CDType cdType3 = cdBuilder.buildPolytronCd();
        cdType3.showItems();
    }
}
