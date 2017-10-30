// LEAVE THIS FILE IN THE DEFAULT PACKAGE
//  (i.e., DO NOT add 'package cs311.pa1;' or similar)

// DO NOT MODIFY THE EXISTING METHOD SIGNATURES
//  (you may, however, add member fields and additional methods)

// DO NOT INCLUDE LIBRARIES OUTSIDE OF THE JAVA STANDARD LIBRARY
//  (i.e., you may include java.util.ArrayList etc. here, but not junit, apache commons, google guava, etc.)

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class WarWithArray
{
    // member fields and methods
    String[] str;
    int size;

    public WarWithArray(String[] s, int k) {
        str = s;
        size = k;
    }

    public ArrayList<String> compute2k() {
        return permute(original);
    }

    private ArrayList<String> permute(str) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            for (int j = i+1; j < str.length; j++) {
                String temp = str[i] + str[j];
                if (checkValid(temp)) {
                    list.add(temp);
                }
            }
        }
        return list;
    }

    private boolean checkValid (String s) {
        for(int i = 1; i + size < s.length(); i++) {
            boolean flag = false;
            for (int i = 0 ; i < size, i++) {
                if (str[i].equals(s)) {
                    flag = true;
                }
            }
        }
        return flag;
    }
}


