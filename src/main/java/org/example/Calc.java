package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Calc {

    public static int run(String exp) {
        int sum = 0;

        //수정 부분
        exp = exp.replace("((", "");
        exp = exp.replace("))", "");
        exp = exp.replace(" - ", " + -");
        boolean needToPlus = exp.contains("+");
        boolean needToMulti = exp.contains("*");
        boolean needToCompound = needToPlus && needToMulti;


        if (needToCompound) {
            String[] bits = exp.split(" \\+ ");
            for (String i : bits) {
                if (i.contains("*")) {
                    sum += run(i);
                } else {
                    sum += Integer.parseInt(i);
                }
            }
            return sum;
        }


        String[] bits = null;

        if (needToMulti) {
            sum = 1;
            bits = exp.split(" \\* ");
            for (int i = 0; i < bits.length; i++) {
                sum *= Integer.parseInt(bits[i]);
            }
            return sum;
        } else if (needToPlus) {
            bits = exp.split(" \\+ ");

            for (int i = 0; i < bits.length; i++) {
                sum += Integer.parseInt(bits[i]);
            }

            return sum;

        }

        throw new RuntimeException("알 수 없음");
    }

}