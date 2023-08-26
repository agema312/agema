package com.digital;

public class CodingBat {
    public static void main(String[] args) {
        //                                  012345
        System.out.println(missingChar("kitten", 1));

    }

    public static String missingChar(String str, int n) {
        return str.substring(0,n) + str.substring(n+1);

    }
    // 012345
    // kitten


}


