// LEAVE THIS FILE IN THE DEFAULT PACKAGE
//  (i.e., DO NOT add 'package cs311.pa1;' or similar)

// DO NOT MODIFY THE EXISTING METHOD SIGNATURES
//  (you may, however, add member fields and additional methods)

// DO NOT INCLUDE LIBRARIES OUTSIDE OF THE JAVA STANDARD LIBRARY
//  (i.e., you may include java.util.ArrayList etc. here, but not junit, apache commons, google guava, etc.)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class WarWithHash
{
    // member fields and methods
    int size;
    String[] str;
    HashMap hash = new HashMap<>();
    public WarWithHash(String[] s, int k)
    {
        str = s;
        size = k;
    }

    public ArrayList<String> compute2k()
    {
        ArrayList<String> modArr = new ArrayList<>();
        for(int i=0; i<str.length; i++){
            hash.put(str[i],str[i]);
        }


        return modArr;
    }

}

