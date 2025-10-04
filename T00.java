//12S25002-Rivaldo Siagian
//12S25015-Chytia lovemia Tambunan 
import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y, hasilpenjumlahan, hasilperkalian;

        x = Integer.parseInt(input.nextLine());
        y = Integer.parseInt(input.nextLine());
        if (x % 2 == 0) {
            System.out.println("Bilangan pertama: Genap ");
        } else {
            System.out.println("Bilangan pertama: Ganjil ");
        }
        if (y % 2 == 0) {
            System.out.println("Bilangan kedua: Genap ");
        } else {
            System.out.println("Bilangan kedua: Ganjil ");
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
            hasilpenjumlahan = x + y;
            System.out.println("Hasil penjumlahan: " + hasilpenjumlahan);
        } else {
            if (x % 2 != 0 && y % 2 != 0) {
                hasilperkalian = x * y;
                System.out.println("Hasil perkalian: " + hasilperkalian);
            } else {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
