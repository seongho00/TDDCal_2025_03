package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calc {
    public static int run(String exp) {

        List<String> exp_arr = new ArrayList<>();

        exp_arr = Arrays.asList(exp.split(""));

        String a1 = test.Test(exp_arr);

        int exp_count = 0;

        for (String i : exp_arr) {
            if (i.equals("+") || i.equals("-") || i.equals("*") || i.equals("/")) {
                exp_count++;
            }
        }


        if (exp_arr.contains("-")) {
            String[] bits = exp.split(" - ");
            int a = Integer.parseInt(bits[0]);
            int b = Integer.parseInt(bits[1]);
            return a - b;
        } else if (exp_arr.contains("+")) {
            String[] bits = exp.split(" \\+ ");
            int a = Integer.parseInt(bits[0]);
            int b = Integer.parseInt(bits[1]);
            return a + b;
        } else if (exp_arr.contains("*")) {
            String[] bits = exp.split(" \\* ");
            int a = Integer.parseInt(bits[0]);
            int b = Integer.parseInt(bits[1]);
            return a * b;
        } else if (exp_arr.contains("/")) {
            String[] bits = exp.split(" / ");
            int a = Integer.parseInt(bits[0]);
            int b = Integer.parseInt(bits[1]);
            return a / b;
        }


//        if (get(2).equals("-")){
//            return a - b;
//        }


        throw new RuntimeException("해석 불가");
    }
}

class test {

    static String Test(List<String> exp_arr) {
        int test = 0;
        try {
            for (String i : exp_arr) {
                test = Integer.parseInt(i);
            }
        } catch (Exception e) {
            return "test";
        }
        return "";
    }
}