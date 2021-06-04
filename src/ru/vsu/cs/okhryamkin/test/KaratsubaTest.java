package ru.vsu.cs.okhryamkin.test;

import org.junit.jupiter.api.Test;
import ru.vsu.cs.okhryamkin.Karatsuba;

import java.math.BigInteger;

public class KaratsubaTest {
    @Test
    public void test() {
        Karatsuba kr = new Karatsuba();
        BigInteger i = BigInteger.valueOf(324324);
        BigInteger j = BigInteger.valueOf(565464);
        System.out.println(kr.karatsuba(i, j));
    }
}
