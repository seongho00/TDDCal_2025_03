package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Calc {

    public static int run(String exp) {

        boolean needToPlus = exp.contains("+");
        boolean needToMinus = exp.contains("-");


        String[] bits = null;

        if (needToPlus) {
            bits = exp.split(" \\+ ");
        } else if (needToMinus) {
            bits = exp.split(" - ");
        }


        boolean Minus = bits[0].contains("-");

        if (Minus) {
            String[] bits2 = bits[0].split(" - ");
            return Integer.parseInt(bits2[0]) - Integer.parseInt(bits2[1]) + Integer.parseInt(bits[1]);
        }


        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[1]);
        int c = 0;

        if (bits.length > 2) {
            c = Integer.parseInt(bits[2]);
        }

        if (needToPlus) {
            return a + b + c;
        } else if (needToMinus) {
            return a - b;
        }

        throw new RuntimeException("해석 불가 : 올바른 계산식이 아닙니다");
    }

}
