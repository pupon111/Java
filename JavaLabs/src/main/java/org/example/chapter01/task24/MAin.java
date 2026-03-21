package org.example.chapter01.task24;

import java.math.BigDecimal;
import java.util.HashSet;

public class MAin {
    static void main() {
        HashSet<BigDecimal> set = new HashSet<>();
        BigDecimal b1 = new BigDecimal("1.00");
        BigDecimal b2 = new BigDecimal("1.0");
        set.add(b1);
        System.out.println(set.contains(b2));
        //set.add(b2);
    }
}
