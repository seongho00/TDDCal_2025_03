package org.example;


import java.util.stream.Collectors;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> fir_input = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));
        List<String> sec_input = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));

        int X = Integer.parseInt(fir_input.get(1));
        List<String> rs = new ArrayList<>();


        for (String i : sec_input) {
            if (Integer.parseInt(i) < X) {
                rs.add(i);
            }
        }

        System.out.println(String.join(" ", rs));

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