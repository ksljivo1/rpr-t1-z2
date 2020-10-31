package ba.unsa.etf.rpr;

public class Suma {
    public static int sumaCifara(int n) {
        int duzina = (int)Math.log10(n) + 1;
        int suma = 0;
        for(int i = 0; i < duzina; i++) {
            suma = suma + n % 10;
            n = n / 10;
        }
        return suma;
    }
}
