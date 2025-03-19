package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Calc {

    public static int run(String exp) {
        int sum = 0;

        exp = exp.replace(" - ", " + -");
        boolean needToPlus = exp.contains("+");
        boolean needToMulti = exp.contains("*");
        boolean needToCompound = needToPlus && needToMulti;
        boolean needTopar = exp.contains("(") && exp.contains(")");


        if (needTopar) {
            String pre_cal = exp.substring(exp.indexOf("((") + 2, exp.indexOf("))"));
            String pre = "" + run(pre_cal);
            //수정 부분
            exp = exp.replace("((" + pre_cal + "))", pre);
            return run(exp);
        }

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
