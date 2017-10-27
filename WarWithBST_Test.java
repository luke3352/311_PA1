import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Luke Sternhagen on 10/26/2017.
 */
public class WarWithBST_Test {
    @Test
    public void test(){
        String[] s = {"AC","CA","CC"};
        WarWithBST war = new WarWithBST(s, 2);

        ArrayList<String> list = war.compute2k();
        System.out.println(list.toString());

        assertTrue(list.contains("ACAC"));
        assertTrue(list.contains("ACCA"));
        assertTrue(list.contains("ACCC"));
        assertTrue(list.contains("CAAC"));
        assertTrue(list.contains("CACA"));
        assertTrue(list.contains("CACC"));
        assertTrue(list.contains("CCAC"));
        assertTrue(list.contains("CCCA"));
        assertTrue(list.contains("CCCC"));
        assertFalse(list.contains("AFKMASLFKASF"));
    }


    @Test
    public void test2(){
        String[] s = {"A","B","C"};
        WarWithBST war = new WarWithBST(s, 3);

        ArrayList<String> list = war.compute2k();
        System.out.println(list.toString());

        assertTrue(list.contains("AAA"));
        assertTrue(list.contains("AAB"));
        assertTrue(list.contains("AAC"));
        assertTrue(list.contains("ABA"));
        assertTrue(list.contains("ABB"));
        assertTrue(list.contains("ABC"));
        assertTrue(list.contains("ACA"));
        assertTrue(list.contains("ACB"));
        assertTrue(list.contains("ACC"));
        assertTrue(list.contains("BAA"));
        assertTrue(list.contains("BAB"));
        assertTrue(list.contains("BAC"));
        assertTrue(list.contains("BBA"));
        assertTrue(list.contains("BBB"));
        assertTrue(list.contains("BBC"));
        assertTrue(list.contains("BCA"));
        assertTrue(list.contains("BCB"));
        assertTrue(list.contains("BCC"));
        assertTrue(list.contains("CAA"));
        assertTrue(list.contains("CAB"));
        assertTrue(list.contains("CAC"));
        assertTrue(list.contains("CBA"));
        assertTrue(list.contains("CBB"));
        assertTrue(list.contains("CBC"));
        assertTrue(list.contains("CCA"));
        assertTrue(list.contains("CCB"));
        assertTrue(list.contains("CCC"));
        assertTrue(list.size() == 27);

        assertFalse(list.contains("AFKMASLFKASF"));
    }

}
