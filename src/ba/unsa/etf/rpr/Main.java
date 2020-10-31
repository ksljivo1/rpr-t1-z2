package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Unesite prirodan broj n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        System.out.println("Brojevi djeljivi sumom svojih cifara su: ");
        for(int i = 1; i <= n; i++) {
            if(i % Suma.sumaCifara(i) == 0) System.out.println(i);
        }
    }
}
