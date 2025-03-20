package org.example;


import java.net.Inet4Address;
import java.util.stream.Collectors;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        List<String> num = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));
        List<Integer> int_num = new ArrayList<>();

        for (String i : num) {
            int_num.add(Integer.parseInt(i));
        }

        double max = Collections.max(int_num);
        double rs = 0;
        for (int i : int_num) {
            double number = (double) i;
            rs += number / max * 100;
        }
        System.out.println(rs / N);
    }
}


//class Main {
//    public static void main(String[] args) {
//
//        Solution s = new Solution();
//
//        System.out.println(s.solution(new int[]{3, 76, 24}));
//
//    }
//}
//
//
//class Solution {
//    public List solution(int[] emergency) {
//
//        List<Integer> num = new ArrayList<>(emergency.length);
//        int[] arr = new int[emergency.length];
//
//
//        int index = 0;
//
//
//        for (int i = 0; i < emergency.length; i++) {
//            if (Collections.max(num).equals(num.get(i))) {
//                num.set(i, ++index);
//                continue;
//
//            }
//        }
//
//
//        return num;
//    }
//}