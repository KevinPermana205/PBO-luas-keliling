package luasdankeliling;

import java.util.Scanner;

public class KllPersegiPanjang implements Keliling{
    private double p,l,kll;

    Scanner input = new Scanner(System.in);
    
    @Override
    public void PersegiPanjang() {
        System.out.print("Panjang : ");
        p = input.nextInt();
        System.out.print("Lebar : ");
        l = input.nextInt();
        kll = 2*(p+l);
        System.out.println("kll Persegi Panjang : "+ kll + " cm^2");
    }
}
