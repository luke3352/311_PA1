// LEAVE THIS FILE IN THE DEFAULT PACKAGE
//  (i.e., DO NOT add 'package cs311.pa1;' or similar)

// DO NOT MODIFY THE EXISTING METHOD SIGNATURES
//  (you may, however, add member fields and additional methods)

// DO NOT INCLUDE LIBRARIES OUTSIDE OF THE JAVA STANDARD LIBRARY
//  (i.e., you may include java.util.ArrayList etc. here, but not junit, apache commons, google guava, etc.)

import java.util.ArrayList;
import java.util.Arrays;

public class WarWithBST
{
    // member fields and methods
    private BinaryST bst;
    private ArrayList<String> str;
    private int size;

    public WarWithBST(String[] s, int k) {
        str.addAll(Arrays.asList(s));
        size = k;
        bst = new BinaryST(s);
    }

    public ArrayList<String> compute2k() {
      return permute();
    }

    private ArrayList<String> permute() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.size(); i++) {
            for (int j = 0; j < str.size(); j++) {
                String temp = str.get(i) + str.get(j);
                if (checkValid(temp)) {
                    list.add(temp);
                }
            }
        }
        return list;
    }

    private boolean checkValid (String s) {
        for(int i = 1; i + size < s.length(); i++) {
            if (!bst.search(s.substring(i, i+size))) {
                return false;
            }
        }
        return true;
    }
}

