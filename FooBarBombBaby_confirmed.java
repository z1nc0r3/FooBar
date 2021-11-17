import java.math.BigInteger;
import java.util.Scanner;

public class FooBarBombBaby_confirmed {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String m = read.next();
        String f = read.next();

        System.out.println(finder(m, f));
    }

    public static String finder(String m, String f){
        BigInteger mach = new BigInteger(m);
        BigInteger facula = new BigInteger(f);
        BigInteger counter = new BigInteger("0");

        BigInteger max = (mach.compareTo(facula) > 0 ) ? mach : facula;
        BigInteger min = (mach.compareTo(facula) < 0 ) ? mach : facula;

        while (true){
            BigInteger val;
            if (!max.toString().equals("1") && !min.toString().equals("1")){
                val = max.remainder(min);
                counter = counter.add(max.divide(min));
                max = val;
            }
            else {
                counter = counter.add(max.subtract(new BigInteger("1")));
                break;
            }

            max = (max.compareTo(min) < 0 ) ? min : max;
            min = (min.compareTo(val) > 0 ) ? val : min;

            if (new BigInteger("0").compareTo(max) >= 0 || new BigInteger("0").compareTo(min) >= 0) {
                return "impossible";
            }
        }

        return counter.toString();
    }
}
