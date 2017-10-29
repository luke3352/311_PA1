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
    public WarWithArray(String[] s, int k)
    {
        str = s;
        size = k;
    }

    public ArrayList<String> compute2k()
    {

        ArrayList<String> modArr = new ArrayList<>();
        ArrayList<String> original = new ArrayList<>(Arrays.asList(str));

        modArr = original;

        modArr = permute(original, modArr);


        return modArr;
    }
    private ArrayList<String> permute(ArrayList<String> original, ArrayList<String> modArr) {
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < modArr.size(); i++) {
            for (int j = 0; j < original.size(); j++) {
                if(checkValid(modArr.get(i)+original.get(j))){
                    newList.add(modArr.get(i) + original.get(j));
                }
            }
        }
        return newList;
    }

    private boolean checkValid(String word){
        char[] char1 = word.toCharArray();
        for(int i=0; i<char1.length; i++){
            if((i+size) <= char1.length){
                String checkWord = "";
                //creating the word
                for(int j =i; j<size+i; j++){
                        checkWord += char1[j];
                }
                boolean isTrue = false;
                for(int k =0; k<str.length; k++){
                    if(checkWord.equals(str[k])) {
                        isTrue = true;
                        break;
                    }
                }
                if(!isTrue){
                    return false;
                }
            }
            else break;
        }
        return true;
    }
}


