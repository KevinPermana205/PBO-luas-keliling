  
package luasdankeliling;

import java.util.Scanner;

public class PersegiPanjang extends Bentuk{
    private double p,l;

    Scanner input = new Scanner(System.in);
    
    @Override
    public double Luas() {
        System.out.print("Panjang : ");
        p = input.nextInt();
        System.out.print("Lebar : ");
        l = input.nextInt();
        return p*l;
    }
    
}
