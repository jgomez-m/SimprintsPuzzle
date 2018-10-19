package com.simprints;

import java.util.*;

public class SortingAsciiCode {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Relentless commitment to Impact", "Robust as fudge","Be Surprisingly bold", "Get Back Up",
                "Make It Happen", "Don't be a Jerk", "Confront the Grey", "Laugh Together, Grow Together");
        System.out.println(ComparatorByAsciiCode.getAsciiCodeList(list));
        Collections.sort(list, new ComparatorByAsciiCode());
        System.out.println(list);
    }
}
