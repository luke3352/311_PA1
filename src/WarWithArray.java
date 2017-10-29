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
        ArrayList<String> original = new ArrayList<>(Arrays.asList(str));
        return permute(original);
    }

    private ArrayList<String> permute(ArrayList<String> original) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < original.size(); i++) {
            for (int j = i+1; j < original.size(); j++) {
                String temp = original.get(i) + original.get(j);
                if (checkValid(temp, original)) {
                    list.add(temp);
                }
            }
        }
        return list;
    }

    private boolean checkValid (String s, ArrayList<String> substrings) {
        for(int i = 1; i + size < s.length(); i++) {
            if (!substrings.contains(s.substring(i, i+size))) {
                return false;
            }
        }
        return true;
    }
}


