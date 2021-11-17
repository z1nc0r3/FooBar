import java.math.BigInteger;

public class FooBarBombBaby {
    public static void main(String[] args){
        String M = "4";
        String F = "7";

        System.out.println(bomb(M, F));
    }

    public static String bomb(String M, String F){
        int counter = 0;

        BigInteger mach = new BigInteger(M);
        BigInteger facula = new BigInteger(F);

        if (M.equals(F) && M.equals("1"))
            return ("0");
        else if (M.equals(F))
            return ("impossible");

        BigInteger max = (mach.compareTo(facula) > 0 ) ? mach : facula;
        BigInteger min = (mach.compareTo(facula) < 0 ) ? mach : facula;

        if (max.remainder(min).toString().equals("0") && (!M.equals("1") && !F.equals("1")))
            return ("impossible");

        while (!max.toString().equals("1") || !min.toString().equals("1") || max.compareTo(new BigInteger("0")) > 1) {
            if (min.toString().equals("1"))
                return (max.subtract(new BigInteger("1")).add(new BigInteger(Integer.toString(counter))).toString());

            BigInteger value = max.subtract(min);
            max = value;

            if (max.toString().equals("0")){
                return ("impossible");
            }

            max = (max.compareTo(min) < 0 ) ? min : max;
            min = (min.compareTo(value) > 0 ) ? value : min;

            counter++;
        }

        return (Integer.toString(counter));
    }
}