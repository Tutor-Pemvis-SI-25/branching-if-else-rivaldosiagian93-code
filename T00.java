//12S25002-Rivaldo Siagian
//12S25015-Chytia lovemia Tambunan 
import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y, hasilPenjumlahan, hasilPerkalian;

        x = input.nextInt();
        y = input.nextInt();
        if (x % 2 == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama: Ganjil");
        }
        if (y % 2 == 0) {
            System.out.println("Bilangan kedua: Genap");
        } else {
            System.out.println("Bilangan kedua: Ganjil");
        }
        if (x > y) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (y > x) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("Kedua bilangan sama besar");
            }
        }
        if (x % 2 == 0 && y % 2 == 0) {
            hasilPenjumlahan = x + y;
            System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
        } else {
            if (x % 2 != 0 && y % 2 != 0) {
                hasilPerkalian = x * y;
                System.out.println("Hasil perkalian: " + hasilPerkalian);
            } else {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
