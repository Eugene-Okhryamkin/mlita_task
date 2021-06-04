package ru.vsu.cs.okhryamkin;

import java.math.BigInteger;

public class Karatsuba {
    public BigInteger karatsuba(BigInteger i, BigInteger j) {
        BigInteger Ten = new BigInteger("10");
        if (i.compareTo(Ten) == -1 || j.compareTo(Ten) == -1)
            return i.multiply(j);
        String length = getLength(i.max(j));
        BigInteger n = new BigInteger(length);
        if (n.mod(new BigInteger("2")) == new BigInteger("1"))
            n.add(new BigInteger ("1"));

        BigInteger a = i.divide(Ten.xor(n.divide((new BigInteger("2")))));
        BigInteger b = i.mod(Ten.xor(n.divide((new BigInteger("2")))));
        BigInteger c = j.divide(Ten.xor(n.divide((new BigInteger("2")))));
        BigInteger d = j.mod(Ten.xor(n.divide((new BigInteger("2")))));

        BigInteger first = karatsuba(a,c);
        BigInteger second = karatsuba(b,d);
        BigInteger third = karatsuba(a.add(b),c.add(d));

        return ((first.multiply(Ten.xor(n))).add (((third.subtract(first).subtract( second)))).multiply(Ten.xor(n.divide((new BigInteger("2"))))).add(second));
    }

    public static String getLength(BigInteger a){
        String b = a.toString();
        return Integer.toString(b.length());
    }
}
