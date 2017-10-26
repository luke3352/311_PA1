// LEAVE THIS FILE IN THE DEFAULT PACKAGE
//  (i.e., DO NOT add 'package cs311.pa1;' or similar)

// DO NOT MODIFY THE EXISTING METHOD SIGNATURES
//  (you may, however, add member fields and additional methods)

// DO NOT INCLUDE LIBRARIES OUTSIDE OF THE JAVA STANDARD LIBRARY
//  (i.e., you may include java.util.ArrayList etc. here, but not junit, apache commons, google guava, etc.)

import java.util.ArrayList;


public class WarWithArray
{
    // member fields and methods
    String[] str;
    int size;
    public WarWithArray(String[] s, int k)
    {
        str = s;
        size = k;
    }

    public ArrayList<String> compute2k()
    {
        ArrayList<String> list = new ArrayList<>();

        for(int i =0; i<str.length; i++){
            for(int j =0; j<str.length; j++){

            }
        }
        list.add(j);
        return null;
    }
    private void permute(String[] str, int l, int r ){
        for (int i = l; i <= r; i++)
        {
            str = swap(str,l,i);
            permute(str, l+1, r);
            str = swap(str,l,i);
        }
    }
}


