package com.simprints;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class ComparatorByAsciiCode implements Comparator<String> {

    private static int convertToAsciiCode(char a) {
        return (int) a;
    }

    private static int sumAsciiCode(String str){
        int result = 0;
        for(int i=0 ; i<str.length(); i++){
            result += convertToAsciiCode(str.charAt(i));
        }
        return result;
    }

    public static List<Integer> getAsciiCodeList(List<String> list){
        return list.stream()
                .map(value -> sumAsciiCode(value))
                .sorted()
                .collect(Collectors.toList());
    }

    @Override
    public int compare(String o1, String o2) {
        Integer sum1 = sumAsciiCode(o1);
        Integer sum2 = sumAsciiCode(o2);
        return sum1.compareTo(sum2);
    }
}