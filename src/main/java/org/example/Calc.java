package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Calc {

    public static int run(String exp) {
        int sum = 0;


        exp = exp.replace(" - ", " + -");

        if (exp.contains("+") && exp.contains("*")) {
            String[] bits1 = exp.split(" \\+ ");
            for (String i : bits1) {
                if (i.contains("*")) {
                    String[] bits2 = i.split(" \\* ");
                    int rs = Integer.parseInt(bits2[0]) * Integer.parseInt(bits2[1]);
                    return Integer.parseInt(bits1[0]) + rs;

                }
            }
        }

        String[] bits = null;

        if (exp.contains("*")) {
            sum = 1;
            bits = exp.split(" \\* ");
            for (int i = 0; i < bits.length; i++) {
                sum *= Integer.parseInt(bits[i]);
            }
            return sum;
        }

        bits = exp.split(" \\+ ");

        for (int i = 0; i < bits.length; i++) {
            sum += Integer.parseInt(bits[i]);
        }

        return sum;

    }

}
