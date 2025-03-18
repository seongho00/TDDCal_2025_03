package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Calc {

    public static int run(String exp) {
        int sum = 0;


        for (int i = 0; i < exp.length(); i++) {
            exp = exp.replace(" - ", " + -");
        }


        String[] bits = null;

        if(exp.contains("*")) {
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
