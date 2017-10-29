import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Luke Sternhagen on 10/26/2017.
 */
public class WarWithArray_Test {

    @Test
    public void test(){
        String[] s = {"AC","CA","CC"};
        WarWithArray war = new WarWithArray(s, 2);

        ArrayList<String> list = war.compute2k();
        System.out.println(list.toString());

        assertTrue(list.contains("ACAC"));
        assertTrue(list.contains("ACCA"));
        assertTrue(list.contains("ACCC"));
        assertFalse(list.contains("CAAC"));
        assertTrue(list.contains("CACA"));
        assertTrue(list.contains("CACC"));
        assertTrue(list.contains("CCAC"));
        assertTrue(list.contains("CCCA"));
        assertTrue(list.contains("CCCC"));
        assertFalse(list.contains("AFKMASLFKASF"));

        assertTrue(list.size() == 8);
    }

    @Test
    public void test2(){
        String[] s = {"ABC","BCD","CDE", "DEF", "EFG", "FGH", "GHI"};
        WarWithArray war = new WarWithArray(s, 3);

        ArrayList<String> list = war.compute2k();
        System.out.println(list.toString());

        assertTrue(list.contains("ABCDEF"));
        assertTrue(list.contains("BCDEFG"));
        assertTrue(list.contains("CDEFGH"));
        assertTrue(list.contains("DEFGHI"));
        assertFalse(list.contains("AFKMASLFKASF"));

        assertTrue(list.size() == 4);
    }




}
