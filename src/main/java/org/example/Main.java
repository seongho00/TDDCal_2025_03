package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.solution(new int[]{3, 76, 24}));

    }
}


class Solution {
    public List solution(int[] emergency) {

        List<Integer> num = Arrays.stream(emergency)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        int index = 0;

        for (int i = 0; i < num.size(); i++) {
            if (Collections.max(num).equals(num.get(i))) {
                num.set(i, ++index);
            }
        }


        return num;
    }
}