// LEAVE THIS FILE IN THE DEFAULT PACKAGE
//  (i.e., DO NOT add 'package cs311.pa1;' or similar)

// DO NOT MODIFY THE EXISTING METHOD SIGNATURES
//  (you may, however, add member fields and additional methods)

// DO NOT INCLUDE LIBRARIES OUTSIDE OF THE JAVA STANDARD LIBRARY
//  (i.e., you may include java.util.ArrayList etc. here, but not junit, apache commons, google guava, etc.)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;


public class WarWithRollHash
{
    // member fields and methods
    private final static int NUM_OF_CHARS = 26;
    private final static int PRIME = 101;
    private int size;
    private Hashtable<Integer, String> hashTable;
    private ArrayList<String> substrings;
    private int h;

    public WarWithRollHash(String[] s, int k) {
        size = k;
        hashTable = new Hashtable<>();
        h = 1;
        for (int i = 0; i < k; i++) {
            h = (h*NUM_OF_CHARS)%PRIME;
        }
        for (String string: s) {
            hashTable.put(getHash(string), string);
        }
        substrings = new ArrayList<>();
        substrings.addAll(Arrays.asList(s));

    }

    public ArrayList<String> compute2k() {
        return permute();
    }

    private ArrayList<String> permute() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < substrings.size(); i++) {
            for (int j = 0; j < substrings.size(); j++) {
                String temp = substrings.get(i) + substrings.get(j);
                if (checkValid(temp)) {
                    list.add(temp);
                }
            }
        }
        return list;
    }

    private boolean checkValid(String s){
        int temp = getHash(s.substring(1, size+1));

        for(int i = 1; i + size < s.length(); i++) {
            if (!hashTable.containsKey(temp) || !hashTable.get(temp).equals(s.substring(i, size+i))) {
                return false;
            }
            if ( i < s.length() - size) {
                temp = (NUM_OF_CHARS*(temp - s.charAt(i)*h) + s.charAt(i+size))%PRIME;
                // We might get negative value of t, converting it
                // to positive
                if (temp < 0) {
                    temp = (temp + PRIME);
                }
            }
        }
        return true;
    }

    private int getHash (String s) {
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            p = (NUM_OF_CHARS*p + s.charAt(i))%PRIME;
        }
        return p;
    }
}

