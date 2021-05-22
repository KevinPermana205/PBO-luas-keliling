package luasdankeliling;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pilihan;
        Scanner input = new Scanner(System.in);

        System.out.println("Program menghitung Luas dan Keliling Persegi Panjang");
        System.out.println("1. menghitung luas ");
        System.out.println("2. menghitung keliling ");
        System.out.print("Masukkan pilihan : ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                PersegiPanjang p = new PersegiPanjang();
                System.out.println("Luas Persegi Panjang : " + p.Luas() + " cm^2");
                break;
            case 2:
                KllPersegiPanjang pp = new KllPersegiPanjang();
                pp.PersegiPanjang();
                break;
        }
    }

}